package Sliding_window;

import java.util.ArrayDeque;
import java.util.Deque;

public class Count_partitions_with_max_min_difference_atMost_k{

    public static int countPartitions(int[] nums, int k) {
        int n = nums.length;
        int MOD = 1_000_000_007;

        long[] dp = new long[n];
        long[] prefix = new long[n];
        Deque<Integer> minDeque = new ArrayDeque<>();
        Deque<Integer> maxDeque = new ArrayDeque<>();

        int left = 0;

        for (int right = 0; right < n; right++) {
            int x = nums[right];

            while (!minDeque.isEmpty() && minDeque.peekLast() > x) {
                minDeque.pollLast();
            }
            minDeque.offerLast(x);

            while (!maxDeque.isEmpty() && maxDeque.peekLast() < x) {
                maxDeque.pollLast();
            }
            maxDeque.offerLast(x);
            // Shrink window until valid
            while (maxDeque.peekFirst() - minDeque.peekFirst() > k) {
                int out = nums[left];

                if (minDeque.peekFirst() == out) minDeque.pollFirst();
                if (maxDeque.peekFirst() == out) maxDeque.pollFirst();

                left++;
            }

            long ways;

            if (right == 0) {
                ways = 1;
            } 
            else if (left == 0) {
                ways = 1 + prefix[right - 1];
            } 
            else {
                ways = prefix[right - 1];
                if (left >= 2) {
                    ways -= prefix[left - 2];
                }
            }

            ways %= MOD;
            if (ways < 0) ways += MOD;

            dp[right] = ways;

            if (right == 0) {
                prefix[right] = dp[right] % MOD;
            } 
            else {
                prefix[right] = (prefix[right - 1] + dp[right]) % MOD;
            }
        }

        return (int) (dp[n - 1] % MOD);
    }
    public static void main(String[] args) {
        int[] nums = {9,4,1,3,7};
        int k = 4;
        int ans = countPartitions(nums, k);
        System.out.println(ans);
    }
}