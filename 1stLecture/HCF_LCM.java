import java.util.Scanner;

public class HCF_LCM {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter any two numbers:");
            int x = in.nextInt();
            int y = in.nextInt();
            int hcf = 0;
            int min = ((x < y)? x: y);
            for (int i = min; i >= 1; i--) {
                if(x % i == 0 && y % i == 0){
                    hcf = i;
                    break;
                }
            }
            System.out.println("HCF of given numbers is:" + hcf);
            int lcm = ((x > y)? x: y);
            while(true){
                if(lcm % x == 0 && lcm % y == 0){
                    System.out.println("LCM of given numbers is:" + lcm);
                    break;
                }
                lcm++;
            }
        }

    }
}
