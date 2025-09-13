
import java.util.Arrays;


// package LeetCode_Problems_Sorting;

public class Max_Product_Of_Three {

    static int maximumProduct(int[] arr){
        Arrays.sort(arr);
        int max1 = 1;
        for (int i = arr.length - 1; i > arr.length - 4; i--) {
            max1 = max1*arr[i];
        }
        int max2 = 1;
        for (int i = 0; i < arr.length; i++) {
            if(i < 2 || i == arr.length - 1){
                max2 = max2*arr[i];
            }
        }
        return (max1 > max2 ? max1 : max2);
    }

    public static void main(String[] args) {
        int[] arr = {-4,-6,1,-2,-8};
        int ans = maximumProduct(arr);
        System.out.println(ans);
    }
}
