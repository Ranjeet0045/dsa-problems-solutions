public class Ulta_number_pyramid {
    //   1 2 3 4  17 18 19 20
    //     5 6 7  14 15 16
    //       8 9  12 13
    //         10 11

    public static void main(String[] args) {
        int k=1;
        int l;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 4-i+1; j >= 1; j--) {
                System.out.print(k + " ");
                k++;
            }
            l = switch (i) {
                case 1 -> 17;
                case 2 -> 14;
                case 3 -> 12;
                default -> 11;
            };
            for (int j = 4-i+1; j >= 1; j--) {
                System.out.print(l + " ");
                l++;
            }
            System.out.println();
        }
    }
}
