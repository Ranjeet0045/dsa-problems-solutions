package Functions;

import java.util.Scanner;

public class Sum_of_n_numbers {

    static void sum(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.print("Sum of N numbers:" + sum);
    }

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter first n numbers:");
            int x = in.nextInt();
            sum(x);
        }

    }
}
