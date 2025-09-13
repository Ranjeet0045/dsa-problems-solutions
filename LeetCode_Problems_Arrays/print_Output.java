// package New_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class print_Output {
    public static void main(String[] args) {
        int arr[] = new int[5];
        System.out.print("Enter 5 elements in array:");
        try (Scanner in = new Scanner(System.in)) {
            //Taking Input
            for (int i = 0; i < arr.length; i++) {
                arr[i] = in.nextInt();
            }
        }
        
        

        // //Printing output->Method 1
        // System.out.print("Output:");
        // for (int i = 0; i < arr.length; i++) {
        //     System.out.print(arr[i] + " ");
        // }

        // // Printing output->Method 2
        // for(int i:arr){
        //     System.out.print(i + " ");
        // }

        //Printing output->Method 3
        System.out.print(Arrays.toString(arr));
    }
}
