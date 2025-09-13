

import java.util.Arrays;

public class Paasing_Functions {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(arr[i]);
        // }
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] arr){
        arr[0] = 90;
        arr[1] = 50;

    }
}
