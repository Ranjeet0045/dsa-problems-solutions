package Recursion;

public class Power_of_two {

    static boolean isPowerOfTwo(int n){
        // boolean ans = false;
        if(n == 1){
            return true;
        }
        return (n%2 == 0) && isPowerOfTwo(n/2);
    }

    public static void main(String[] args) {
        int n = 3;
        boolean ans = isPowerOfTwo(n);
        System.out.println(ans);
    }
}
