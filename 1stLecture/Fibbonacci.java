import java.util.Scanner;

public class Fibbonacci {
    public static void main(String[] args) {
        System.out.print("Enter number of terms required:");
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            int a = 0;
            int b = 1;
            switch (n) {
                case 1 -> System.out.print(a);
                case 2 -> System.out.print(a + " " + b);
                default -> {
                    System.out.print(a + " " + b + " ");
                    for (int i = 0; i < n - 2; i++) {
                        int sum = a + b;
                        a = b;
                        b = sum;
                        System.out.print(sum + " ");
                    }
                }
            }
        }
    }
}
