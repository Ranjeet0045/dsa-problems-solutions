import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter any number:");
            int num = in.nextInt();
            int n = String.valueOf(num).length();
            int temp = num;
            int sum = 0;
            while(num > 0){
                int rem = num % 10;
                sum = (int) (sum + Math.pow(rem, n));
                num = num/10;
            }
            if(sum == temp){
                System.out.println("Armstrong number");
            }
            else{
                System.out.println("Not armstrong");
            }
        }
    }
}
