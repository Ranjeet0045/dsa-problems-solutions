import java.util.Scanner;

public class Negative_Odd_Even_Sum {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            // Variables to store sums
            int sumNegative = 0;
            int sumPositiveEven = 0;
            int sumPositiveOdd = 0;
            System.out.println("Enter numbers (Enter 0 to terminate):");
            while (true) {
                int num = in.nextInt(); // Read the number
                
                // Termination condition
                if (num == 0) {
                    break;
                }
                
                // Check if the number is negative
                if (num < 0) {
                    sumNegative += num;
                }
                // Check if the number is positive and even
                else if (num > 0 && num % 2 == 0) {
                    sumPositiveEven += num;
                }
                // Check if the number is positive and odd
                else if (num > 0 && num % 2 != 0) {
                    sumPositiveOdd += num;
                }
            }   // Print the sums
            System.out.println("Sum of negative numbers: " + sumNegative);
            System.out.println("Sum of positive even numbers: " + sumPositiveEven);
            System.out.println("Sum of positive odd numbers: " + sumPositiveOdd);
            // Close the scanner
        }
    }
}