public class Capital_M {

    //        *      *
    //      *   *  *   *
    //    *      *      *

    public static void main(String[] args) {
        int sum=0;
        int sum2=6;
        int sum3=0;
        for (int i = 1; i <= 3; i++) {
           for (int j = 6-i; j > i; j--) {
            System.out.print(" ");
           }
           System.out.print("*");
           for (int j = 1; j <=sum; j++) {
            if(i>1)
            System.out.print(" ");
           }
           sum+=3;
           if(i>1){
            System.out.print("*");
           }
           for (int j = sum2; j >=1; j--) {
            if(i<3)
            System.out.print(" ");
           }
           sum2-=4;
           if(i<3){
            System.out.print("*");
           }
           for (int j = 1; j <=sum3; j++) {
            if(i>1)
            System.out.print(" ");
           }
           sum3+=3;
           if(i>1){
            System.out.print("*");
           }
           System.out.println();
        }
    }
}
