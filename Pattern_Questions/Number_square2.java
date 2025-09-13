import java.util.Scanner;

public class Number_square2 {

        //  4 4 4 4 4 4 4  
        //  4 3 3 3 3 3 4   
        //  4 3 2 2 2 3 4   
        //  4 3 2 1 2 3 4   
        //  4 3 2 2 2 3 4   
        //  4 3 3 3 3 3 4   
        //  4 4 4 4 4 4 4   

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
                    int k = Math.max(Math.max(ldist,rdist),Math.max(udist,ddist));
                    int ans = k-n/2+1;
                    System.out.print(ans + " ");
                }
                System.out.println();
            }
        }
    }
}
