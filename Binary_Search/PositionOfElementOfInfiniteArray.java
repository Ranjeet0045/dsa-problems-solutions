package Binary_Search;

public class PositionOfElementOfInfiniteArray {

    static int answer(int[] arr,int target){
        int start = 0;
        int end = 1;
        while(end < arr.length && target > arr[end]){
            int newStart = end +1;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return binSearch(arr ,target, start, end);
    }

    static int binSearch(int[] arr,int target,int start,int end){
        while(start <= end){
            int mid = (start + end)/2;
            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                System.out.print("Present at index : ");
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {12,31,43,45,65,67,87,89,100,121,123,124,136,167,189,201,205,208,212,215,217,220,221,222,223,224,225,226,227,228};
        int target = 222;
        int ans = answer(arr,target);
        System.out.println(ans);
    }
}
