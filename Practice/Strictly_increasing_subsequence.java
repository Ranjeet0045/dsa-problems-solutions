public class Strictly_increasing_subsequence {

    static int helper(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        int max = 1;

        for(int i = 0; i < n; i++) {
            dp[i] = 1;
        }

            for(int i = 1; i < n; i++) {
                for(int j = 0; j < i; j++) {
                    if(nums[i] > nums[j]) {
                        dp[i] = Math.max(dp[i], dp[j] + 1);
                    }
                }
                max = Math.max(max, dp[i]);
            }
        return max;
}


    public static void main(String[] args) {
        int[] arr = {0,1,0,3,2,3};
        int ans = helper(arr);
        System.out.println(ans);
    }
}
