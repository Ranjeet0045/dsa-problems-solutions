package Dynamic_programming.Memorization;

import java.util.Arrays;

public class Best_time_to_buy_and_sell_stocks_5 {
    static long neg = (long)(-1000000007);

    public static long maximumProfit(int[] prices, int k) {
        int n = prices.length;
        long[][][] dp = new long[n][k+1][3];
        
        for(long[][] arr:dp){
            for(long[] ar:arr){
                Arrays.fill(ar,-1);
            }
        }
        return memo(0, k, 0, prices, n, dp);
    }

    private static long memo(int i, int k, int state, int[] prices, int n, long[][][] dp){
        if(i == n){
            return state == 0 ? 0 : neg;
        }
        if(dp[i][k][state] != -1) return dp[i][k][state];

        long ans = neg;

        if(state == 0){
            ans=memo(i+1, k, 0, prices, n, dp);

            if(k>0){
                ans = Math.max(ans, -prices[i] + memo(i+1, k-1, 1, prices, n, dp)) ;
                ans = Math.max(ans, prices[i] + memo(i+1, k-1, 2, prices, n, dp));
            }
        }
        else if(state==1){
            ans = Math.max(memo(i+1, k, 1, prices, n, dp),prices[i] + memo(i+1,k,0,prices,n,dp));
        }
        else{
            ans = Math.max(memo(i+1, k, 2, prices, n, dp),-prices[i] + memo(i+1, k, 0, prices, n, dp));
        }

        return dp[i][k][state] = ans;
    }
    public static void main(String[] args) {
        int[] prices = {1,7,9,8,2};
        int k = 2;
        long ans = maximumProfit(prices, k);
        System.out.println(ans);
    }
}
