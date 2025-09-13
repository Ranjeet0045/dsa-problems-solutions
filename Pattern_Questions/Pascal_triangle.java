public class Pascal_triangle {

    //           1
    //         1   1
    //       1   2   1
    //     1   3   3   1
    //   1   4   6   4   1

    static int factorial(int n){
        int fact = 1;
        int i = 1;
        while(i <= n){
            fact = fact*i;
            i++;
        }
        return fact;
    }

    static int permutation(int n, int r){
        int ncr = factorial(n)/(factorial(r)*factorial(n-r));
        return ncr;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                int icj = permutation(i,j);
                System.out.print(icj + " ");
            }
            System.out.println();
        }
    }
}
