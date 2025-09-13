package Functions;
import java.util.Scanner;

public class All_Prime {

    // Function to check if a number is prime
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false; // 0 and 1 are not prime
        }
        for (int j = 2; j * j <= n; j++) { // check divisibility up to sqrt(n)
            if (n % j == 0) {
                return false; // not a prime number
            }
        }
        return true; // is prime
    }

    // Function to print prime numbers between x and y
    static void prime_list(int x, int y) {
        for (int i = x; i <= y; i++) { // Changed to include 'y' as well
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter two numbers between which prime numbers are required: ");
            int x = in.nextInt();
            int y = in.nextInt();
            prime_list(x, y); // Print all primes between x and y
            // Close the scanner
        }
    }
}
