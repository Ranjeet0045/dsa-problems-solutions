// package LeetCode_Problems_Searching;

public class Ceiling_Of_Number {

    static int Ceiling(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target == arr[mid]){
                return mid;
            }
            if(target > arr[mid]){
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }

        return start;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 4;
        int ans = Ceiling(arr,target);
        System.out.println(ans);
    }
}
