public class Star_Diamond {
    
    //      *         
    //     * *
    //    * * *
    //   * * * *
    //  * * * * *
    //   * * * *
    //    * * *
    //     * *
    //      *

    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            int space = ((i<=5)?5-i:i-5);
            for (int j = 1; j <= space; j++) {
               System.out.print(" "); 
            }
            int star = ((i<=5)?i:10-i);
            for (int j = 1; j <= star; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
