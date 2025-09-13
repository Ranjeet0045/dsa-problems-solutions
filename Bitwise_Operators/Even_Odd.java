// package Bitwise_Operators.java;

public class Even_Odd {

    static boolean isOdd(int n){
        return (n & 1) == 1;
    }

    public static void main(String[] args) {
        int n = 62;
        System.out.println(isOdd(n));
    }
}
 