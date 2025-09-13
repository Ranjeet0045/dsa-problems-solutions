

import java.util.Arrays;

public class Array_Sort {

    static int sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Smallest element is:" + arr[0]);
        System.out.println("Largest element is:" + arr[6]);

        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {1,7,4,2,8,6,9};
        sort(arr);
    }
}
