// package Bitwise_Operators.java;

public class Find_ith_bit {

    static int find(int n,int i){
        int value = n & (1 << (i-1));
        int bit = (n >> (i - 1)) & 1;
        System.out.println("Bit is:" + bit);
        System.out.print("value is:");
        return value;
    }

    public static void main(String[] args) {
        int n = 12;
        int i = 3;
        System.out.println(find(n,i));
    }
}
