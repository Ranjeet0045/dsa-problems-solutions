public class Hollow_diamond {

    //Hollow diamond

    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            int col  = ((i<=5) ? 5-i : i-5);
            for (int j = 1; j <= col; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            int space = ((i>=1 && i<=5)?2*i-3:2*(10-i-1)-1);
            if (space > 0) {
                for (int j = 1; j <= space; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
