public class Number_diamond {

    //      1
    //     212
    //    32123
    //   4321234
    //    32123
    //     212
    //      1

    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            int space = ((i<=4)?4-i:i-4);
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            int lcol = ((i<=4)?i:8-i);
            for (int j = lcol; j >= 1; j--) {
                System.out.print(j);
            }
            int rcol = ((i>=1 && i<=4)?i-1:7-i);
            for (int j = 2; j <= rcol+1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
