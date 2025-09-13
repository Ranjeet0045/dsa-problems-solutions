import java.util.Scanner;

public class Number_square {


    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter no. of rows:");
            int n = in.nextInt();
            for (int i = 0; i <= n; i++) {
                for (int j = 0; j <= n; j++) {
                    int ldist = j;
                    int rdist = n-j;
                    int udist = i;
                    int ddist = n-i;
                    int k = Math.min(Math.min(ldist,rdist),Math.min(udist,ddist));
                    System.out.print(k + " ");
                }
                System.out.println();
            }
        }
    }
}
