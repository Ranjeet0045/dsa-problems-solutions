
import java.util.Arrays;

public class Majority_Element {

    static int majorityElement(int[] arr){
        Arrays.sort(arr);
        int count = 1;
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] == arr[i-1]){
                count++;
            }
            else{
                count = 1;
                ans = arr[i];
            }
            if(count > arr.length/2){
                return ans;
            }
        }
        return ans;
    }


    // static int majorityElement(int[] arr){
    //     for (int i = 0; i < arr.length; i++) {
    //         int temp = arr[i];
    //         int count = 0;
    //         int j = i;
    //         while(j < arr.length){
    //             if(temp == arr[j]){
    //                 count++;
    //             }
    //             j++;
    //         }
    //         if(count >= arr.length/2){
    //             return arr[i];
    //         }
    //     }
    //     return -1;
    // }

    public static void main(String[] args) {
        int[] arr = {3,2,2};
        int ans = majorityElement(arr);
        System.out.println(ans);
    }
}
