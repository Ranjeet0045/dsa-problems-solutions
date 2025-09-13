package Binary_Search;

public class RotationCount {

    //Rotation Count will be equal to pivot element

    static int rotation(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start < end){

            //Finding Pivot Element

            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid+1]){
                System.out.print("Total rotations are : ");
                return mid + 1;
            }
            if(arr[mid] >= arr[start]){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        System.out.print("Total rotations are : ");
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {4,5,6,1,2,3};  //Rotated Array
        int ans = rotation(arr);
        System.out.println(ans);
    }
}
