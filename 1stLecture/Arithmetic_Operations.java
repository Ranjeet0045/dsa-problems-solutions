import java.util.Scanner;

public class Arithmetic_Operations {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter 1st number:");
            int x = in.nextInt();
            System.out.print("Enter second number:");
            int y = in.nextInt();
            System.out.print("Enter any operator from +,-,*,/:");
            char op = in.next().charAt(0);
            switch (op) {
                case '+' ->                 {
                        int res = x + y;
                        System.out.print("Result is:" + res);
                    }
                case '-' ->                 {
                        int res = x - y;
                        System.out.print("Result is:" + res);
                    }
                case '*' ->                 {
                        int res = x * y;
                        System.out.print("Result is:" + res);
                    }
                case '/' ->                 {
                        int res = x / y;
                        System.out.print("Result is:" + res);
                    }
                default -> System.out.println("Invalid operator");
            }
        }
    } 
}
