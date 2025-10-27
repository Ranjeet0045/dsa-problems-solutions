package Dynamic_programming.Memorization;

import java.util.Arrays;

public class Fiboannaci {

    public static int fibo(int n){
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        return helper(n,dp);
    }
    public static int helper(int n,int[] dp){
        if(n <= 1) return n;
        if(dp[n] != -1) return dp[n];
        dp[n] = helper(n-2,dp) + helper(n-1,dp);
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 5;
        int ans = fibo(n);
        System.out.println(ans);
    }
}
