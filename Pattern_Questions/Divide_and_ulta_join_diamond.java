public class Divide_and_ulta_join_diamond {

    //    *        *
    //    **      **
    //    ***    ***
    //    ****  ****
    //    **********
    //    ****  ****
    //    ***    ***
    //    **      **
    //    *        *

    public static void main(String[] args) {
        for (int i = 1; i<= 9; i++) {
            int col = ((i<=5)?i:9-i+1);
            for (int j = 1; j <= col; j++) {
                System.out.print("*");
            }
            int space = ((i<=5)?10-2*i:2*i-10);
            for (int j = 1; j <= space; j++) {
               System.out.print(" "); 
            }
            for (int j = col; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
