package Binary_Search;

public class CeilingOfNumber {

    static int Ceiling(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            
            if(target < arr[mid]){
                end = mid-1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                System.out.print("Index of Ceiling is : ");
                return mid;
            }
        }
        System.out.print("Index of ceiling : ");
        return start;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,5,6,8,9,12,14,56};
        int target = 7;
        int ans = Ceiling(arr,target);
        System.out.println(ans);
    }
}
