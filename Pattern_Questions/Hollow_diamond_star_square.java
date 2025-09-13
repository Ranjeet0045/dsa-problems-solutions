public class Hollow_diamond_star_square {
    
    //   **********
    //   ****  ****
    //   ***    ***
    //   **      **
    //   *        *
    //   *        *
    //   **      **
    //   ***    ***
    //   ****  ****
    //   **********

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            int lstar = ((i<=5)?6-i:i-5);
            for (int j = 1; j <= lstar; j++) {
                System.out.print("*");
            }
            int space = ((i>=1 && i<=5)?2*i-2:20-2*i);
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            int rstar = ((i<=5)?6-i:i-5);
            for (int j = rstar; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
