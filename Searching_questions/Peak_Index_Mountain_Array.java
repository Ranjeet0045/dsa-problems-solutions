public class Peak_Index_Mountain_Array {

    //BruteForce Approach with O(n) time complexity

    // static int Peak_Index(int[] arr){
    //     int max = arr[0];
    //     int temp = -1;
    //     for (int i = 0; i < arr.length - 1; i++) {
    //         if(arr[i] > max){
    //             max = arr[i];
    //             temp = i;
    //         }
            
    //     }
    //     return temp;
    // }

    static int Peak_Index(int[] arr){
        int left = 0;
        int right = arr.length - 1;
        while(left < right){
            int mid = left + (right - left)/2;
            if(arr[mid] > arr[mid+1]){
                right = mid;
            }
            else{
                left = mid + 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] arr = {3,5,3,2,0};
        System.out.println(Peak_Index(arr));
    }
}
