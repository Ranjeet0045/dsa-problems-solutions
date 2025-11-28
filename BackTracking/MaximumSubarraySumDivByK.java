package BackTracking;

public class MaximumSubarraySumDivByK {

    public static long maxSubarraySum(int[] nums, int k) {
        int n = nums.length;
        long[] prefix = new long[n + 1];

        for (int i = 1; i <= n; i++)
            prefix[i] = prefix[i - 1] + nums[i - 1];

        long maxSum = Long.MIN_VALUE;

        // check all subarrays
        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {

                int length = end - start + 1;

                if (length % k == 0) {
                    long sum = prefix[end + 1] - prefix[start];
                    maxSum = Math.max(maxSum, sum);
                }
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {-1, -2, -3, -4, -5};
        int k = 4;
        System.out.println(maxSubarraySum(nums, k));
    }
}
