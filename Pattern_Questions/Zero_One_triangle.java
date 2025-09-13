
import java.util.Scanner;

public class Zero_One_triangle {

    //    1
    //    0 1
    //    1 0 1
    //    0 1 0 1
    //    1 0 1 0 1

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter number of required rows:");
            int n = in.nextInt();
            for (int i = 1; i <= n; i++) {
               int k = i;
               for (int j = 1; j <= i; j++) {
                if((k%2)==0){
                    System.out.print("0" + " ");
                }
                else{
                    System.out.print("1" + " ");
                }
                k++;
               }
               System.out.println();
            }
        }
    }
}
