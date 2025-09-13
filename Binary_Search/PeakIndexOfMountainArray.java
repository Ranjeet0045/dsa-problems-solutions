package Binary_Search;

public class PeakIndexOfMountainArray {

    static int Peak(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while( start < end ){
            int mid = (start + end) / 2;
            if(arr[mid] > arr[mid+1]){
                end = mid;
            }
            else{
                start = mid + 1;
            }
        }
        System.out.print("Peak index is : ");
        return start;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,6,7,16,25,28,31,12,10,9,6,2,1};
        int ans = Peak(arr);
        System.out.println(ans);
    }
}
