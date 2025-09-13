package TwoPointer_Approach;

import java.util.Scanner;

public class SquareSort {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // Taking input size
        String s = "Enter the number of elements: ";
        System.out.print(s);
        int n = in.nextInt();
        
        // Declaring and taking input for the array
        int[] hello = new int[n];
        int[] arr = hello;
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        
        // Squaring the elements
        int[] squaredArr = hello;
        for (int i = 0; i < n; i++) {
            squaredArr[i] = arr[i] * arr[i];
        }
        
        // Sorting the squared array using Bubble Sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (squaredArr[j] > squaredArr[j + 1]) {
                    // Swap the elements
                    int temp = squaredArr[j];
                    squaredArr[j] = squaredArr[j + 1];
                    squaredArr[j + 1] = temp;
                }
            }
        }
        
        // Printing the sorted squared array
        System.out.println("Squared values in non-decreasing order:");
        for (int i = 0; i < n; i++) {
            System.out.print(squaredArr[i] + " ");
        }
        in.close();
    }
}
