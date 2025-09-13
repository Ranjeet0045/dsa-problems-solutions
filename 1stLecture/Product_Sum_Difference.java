import java.util.Scanner;

public class Product_Sum_Difference {

    static int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        int len = String.valueOf(n).length();
        for (int i = 0; i < len; i++) {
           int rem = n % 10;
           product = product*rem;
           sum = sum + rem;
           n = n/10;
        }
        int result = product - sum;
        return result;
   }
   

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter any number:");
            int num = in.nextInt();
            int result = subtractProductAndSum(num);
            System.out.print("Difference of product and sum is:" + result);
        }
    }
}
