package Dynamic_programming.Memorization;

import java.util.Arrays;

public class Best_time_to_buy_and_sell_stocks_4 {

    public static int helper(int[] prices, int k, int idx, boolean holding, int[][][] dp) {
        // Base cases
        if (idx == prices.length || k == 0) return 0;

        int holdFlag = holding ? 1 : 0;
        if (dp[idx][k][holdFlag] != -1) return dp[idx][k][holdFlag];

        int ans;
        if (holding) {
            int sell = helper(prices, k - 1, idx + 1, false, dp) + prices[idx];
            int hold = helper(prices, k, idx + 1, true, dp);
            ans = Math.max(sell, hold);
        } 
        else {
            int buy = helper(prices, k, idx + 1, true, dp) -prices[idx];
            int skip = helper(prices, k, idx + 1, false, dp);
            ans = Math.max(buy, skip);
        }

        return dp[idx][k][holdFlag] = ans;
    }

    public static int maxProfit(int k, int[] prices) {
        int n = prices.length;
        if (n == 0 || k == 0) return 0;

        // Edge case: if k >= n/2, treat as infinite transactions
        if (k >= n / 2) {
            int profit = 0;
            for (int i = 1; i < n; i++) {
                if (prices[i] > prices[i - 1]) profit += prices[i] - prices[i - 1];
            }
            return profit;
        }

        int[][][] dp = new int[n][k + 1][2];
        for (int i = 0; i < n; i++)
            for (int j = 0; j <= k; j++)
                Arrays.fill(dp[i][j], -1);

        return helper(prices, k, 0, false, dp);
    }

    public static void main(String[] args) {
        int k = 2;
        int[] prices = {2, 4, 1};
        int ans = maxProfit(k, prices);
        System.out.println(ans); // Expected output: 2
    }
}
