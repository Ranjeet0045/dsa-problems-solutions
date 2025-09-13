package Binary_Search;

public class SearchElementInMountainArray {

    static int findPeak(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            int mid = (start + end) / 2;
            if(arr[mid] > arr[mid+1]){
                end = mid;
            }
            else{
                start = mid + 1;
            }
        }
        return start;
    }

    static int binarySearchIncreasingPart(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid = (start + end)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid]<target){
                start = mid + 1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }

    static int binarySearchDecreasingPart(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid = (start + end)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid]>target){
                start = mid + 1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }

    static int findElement(int[] arr,int target){
        int peak = findPeak(arr);
        int result = binarySearchIncreasingPart(arr,target,0,peak);
        if(result!=-1){
            return result;
        }
        return binarySearchDecreasingPart(arr,target,peak+1,arr.length-1);
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,8,9,12,15,18,14,11,9,8,7,5,4,2};
        int target = 7;
        int ans = findElement(arr,target);
        if (ans != -1) {
            System.out.println("Element present at index: " + ans);
        } else {
            System.out.println("Element not found");
        }
    }
}
