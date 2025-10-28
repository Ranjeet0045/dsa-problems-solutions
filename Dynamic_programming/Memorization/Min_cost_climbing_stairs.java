package Dynamic_programming.Memorization;

import java.util.Arrays;

public class Min_cost_climbing_stairs {

    public static int helper(int[] cost,int i,int[] dp){
        if(i <= 1) return cost[i];
        if(dp[i] != -1) return dp[i];
        return dp[i] = cost[i] + Math.min(helper(cost,i-1,dp),helper(cost,i-2,dp));
    }
    public static int minCostClimbingStairs(int[] cost) {
       int n = cost.length;

        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);

        return Math.min(helper(cost,n-1,dp),helper(cost,n-2,dp));
    }

    public static void main(String[] args) {
        int[] cost = {1,100,1,1,1,100,1,1,100,1};
        int ans = minCostClimbingStairs(cost);
        System.out.println(ans);
    }
}
