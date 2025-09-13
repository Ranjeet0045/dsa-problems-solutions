
import java.util.Arrays;


// package Bubble_Sort;

public class New {

    static void sort(int[] arr){
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - 1; j++) {
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;   // Condition for already sorted array to reduce time complexity
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,1,4,2,5,7};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

