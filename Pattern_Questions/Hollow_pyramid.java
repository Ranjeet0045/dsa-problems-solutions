public class Hollow_pyramid {
    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            for (int j = -1; j < 2-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println(" *   *");
        for (int i = 0; i < 7; i++) {
            System.out.print("*");
        }
    }
}
