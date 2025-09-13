import java.util.Scanner;

public class Pallindrome_Number {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter any number:");
            int x = in.nextInt();
            int num = x;
            int sum = 0;
            while(x > 0){
                int rem = x % 10;
                sum = (sum*10) + rem;
                x = x/10;
            }
            if(num == sum){
                System.out.print("Pallindrome number");
            }
            else{
                System.out.print("Not pallindrome");
            }
        }
    }
}
