package Dynamic_programming.Tabulation;

import java.util.Arrays;

public class Minimum_taps_to_water_garden {

    public static int minTaps(int n, int[] ranges) {

        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for (int i = 0; i <= n; i++) {
            int left = Math.max(0, i - ranges[i]);
            int right = Math.min(n, i + ranges[i]);

            // If dp[left] is still unreachable, skip this tap
            if (dp[left] == Integer.MAX_VALUE) continue;

            // Open this tap: update every position it can water
            for (int j = left; j <= right; j++) {
                dp[j] = Math.min(dp[j], dp[left] + 1);
            }
        }

        return dp[n] == Integer.MAX_VALUE ? -1 : dp[n];
    }
    public static void main(String[] args) {
        int n = 5;
        int[] ranges = {3,4,1,1,0,0};
        int ans = minTaps(n,ranges);
        System.out.println(ans);
    }
}
