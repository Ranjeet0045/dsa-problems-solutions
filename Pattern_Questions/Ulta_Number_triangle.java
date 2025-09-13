public class Ulta_Number_triangle {

    //   1 1 1 1 1 1
    //   2 2 2 2 2
    //   3 3 3 3
    //   4 4 4
    //   5 5
    //   6
    public static void main(String[] args) {
        for (int i = 1; i <= 6; i++) {
           for (int j = 7-i; j >= 1; j--) {
            System.out.print(i + " ");
           }
           System.out.println();
        }
    }
}
