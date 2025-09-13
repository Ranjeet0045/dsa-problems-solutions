
import java.util.Scanner;

public class LeapYear{
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter any year:");
            int x = in.nextInt();
            if(x % 4 == 0){
                if(x % 100 == 0){
                    if(x % 400 ==0){
                        System.out.print("Leap year");
                    }else{
                        System.out.print("Not a leap year");
                    }
                }
                else{
                    System.out.print("Leap year");
                }
            }else{
                System.out.println("Not a leap year");
            }
        }
    }
}