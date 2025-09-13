// package New_Arrays;

import java.util.Arrays;
// import java.util.Scanner;

public class Two_D_Array_input {
    public static void main(String[] args) {
        int arr[][] = {
            {1,2,3},
            {4,5,6},
        };
        // Scanner in = new Scanner(System.in);
        // System.out.print("Enter elements in array:");
        // for (int[] arr1 : arr) {
        //     for (int col = 0; col < arr1.length; col++) {
        //         arr1[col] = in.nextInt();
        //     }
        // }

        // for (int i = 0; i < arr.length; i++) { 
        //     int[] arr1 = arr[i]; 
        //     for (int j = 0; j < arr1.length; j++) { 
        //         System.out.print(Arrays.toString(arr1)); 
        //         break; 
        //     } 
        //     System.out.println(); 
        // }

        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j < arr[i].length; j++) {
        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println(); // Move to the next line
        // }

        for (int[] arr1 : arr) {
            for (int j = 0; j < arr1.length; j++) {
                System.out.print(Arrays.toString(arr1));
                break;
            }
            System.out.println(); 
        }
    }
}
