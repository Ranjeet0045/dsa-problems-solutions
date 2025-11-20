package Dynamic_programming.Memorization;

import java.util.Arrays;

public class Minimum_cost_to_cut_stick {

    public static int solve(int[] arr, int left, int right, int[][] dp){
        if(right - left < 2) return 0;

        if(dp[left][right] != -1) return dp[left][right];

        int result = Integer.MAX_VALUE;

        for(int i=left+1; i<right; i++){
            int cost = (arr[right] - arr[left]) + solve(arr, left, i, dp) + solve(arr, i, right, dp);
            result = Math.min(cost,result);
        }

        return dp[left][right] = result;
    }

    public static int minCost(int n, int[] cuts) {
        int[] arr = new int[cuts.length + 2];
        arr[0] = 0;
        arr[arr.length - 1] = n;
        System.arraycopy(cuts, 0, arr, 1, cuts.length);
        Arrays.sort(arr);
        
        int[][] dp = new int[103][103];
        for(int i=0; i<dp.length; i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(arr,0,arr.length-1,dp);
    }
    public static void main(String[] args) {
        int n = 7;
        int[] cuts = {1,3,4,5};
        int ans = minCost(n, cuts);
        System.out.println(ans);
    }
}
