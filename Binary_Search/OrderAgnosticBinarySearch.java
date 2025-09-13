package Binary_Search;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,3,4,12,14,16,34,56,67,78};
        // int[] arr = {98,87,76,54,43,21,16,12,11,10,9};
        int target = 16;
        int ans = OrderSearch(arr,target);
        System.out.println(ans);
    }
    static int OrderSearch(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        boolean istrue = arr[start] < arr[end];
        while(start <= end){
           int mid = (start+end)/2;

           if(arr[mid] == target){
            System.out.print("Present at index : ");
            return mid;
           }

           if(istrue){
            if(target < arr[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
           }
           else{
            if(target > arr[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
           }
        }
        return -1;
    }
}
