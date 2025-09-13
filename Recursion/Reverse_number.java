package Recursion;

public class Reverse_number {

    static int sum = 0;
    static void reverse2(int n){
        if(n == 0){
            return;
        }
        int rem = n % 10;
        sum = (sum*10) + rem;
        reverse2(n/10);
    }

    // static int reverse1(int n){
    //     int digits = (int)(Math.log10(n)) + 1;
    //     return helper(n, digits);
    // }

    // static int helper(int n, int digits){
    //     if(n%10 == n){
    //         return n;
    //     }
    //     int rem = n % 10;
    //     return rem*(int)(Math.pow(10,digits-1)) + helper(n/10,digits-1);
    // }

    public static void main(String[] args) {
        // int ans1 = reverse1(5634);
        reverse2(7563);
        // System.out.println(ans1);
        System.out.println(sum);
    }
}
