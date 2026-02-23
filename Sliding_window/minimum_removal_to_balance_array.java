package Sliding_window;
import java.util.Arrays;

public class minimum_removal_to_balance_array {

    public static int minRemoval(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);

        int l = 0;
        int maxLen = 0;

        for (int r = 0; r < n; r++) {
            while (nums[r] > (long) nums[l] * k) {
                l++;
            }

            maxLen = Math.max(maxLen, r - l + 1);
        }

        return n - maxLen;
    }
    public static void main(String[] args) {
        int[] nums = {1,6,2,9};
        int k = 3;
        int ans = minRemoval(nums, k);
        System.out.println(ans);
    }
}
