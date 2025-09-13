package Recursion;
// package recursion;

public class Count_zeroes {

    static int count(int n){
        int count = 0;
        if (n == 0){
            return count;
        }
            if(n % 10 == 0){
            count++;
        }
        return count + count(n/10);
    }

   public static void main(String[] args) {
     int n = 10602;
     System.out.println(count(n));
   } 
}
