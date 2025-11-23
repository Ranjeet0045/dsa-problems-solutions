package Dynamic_programming.Memorization;

import java.util.Arrays;

public class Greatest_sum_divisible_by_three {

    public static int maxSumDivThree(int[] nums) {
        int[][] dp = new int[nums.length + 1][3];

        for (int i = 0; i <= nums.length; i++) {
            Arrays.fill(dp[i], -1);
        }

        return find(nums, 0, 0, dp);
    }

    public static int find(int[] nums, int idx, int currRem, int[][] dp) {
        if (idx == nums.length) return (currRem == 0) ? 0 : Integer.MIN_VALUE;

        if (dp[idx][currRem] != -1) return dp[idx][currRem];

        int pick = nums[idx] + find(nums, idx + 1, (currRem + nums[idx]) % 3, dp);
        int notPick = find(nums, idx + 1, currRem, dp);

        dp[idx][currRem] = Math.max(pick, notPick);
        return dp[idx][currRem];
    }

    public static void main(String[] args) {
        int[] nums = {3, 6, 5, 1, 8};
        int result = maxSumDivThree(nums);
        System.out.println(result == Integer.MIN_VALUE ? 0 : result);
    }
}
