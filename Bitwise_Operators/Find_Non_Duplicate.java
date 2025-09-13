// package Bitwise_Operators.java;

public class Find_Non_Duplicate {

    static int find_ans(int[] arr){
        int unique = 0;
        for(int n : arr){
            unique ^= n;
        }
        return unique;
    }

    public static void main(String[] args) {
        int[] arr = {3,2,1,5,3,1,2};
        int ans = find_ans(arr);
        System.out.println(ans);
    }
}
