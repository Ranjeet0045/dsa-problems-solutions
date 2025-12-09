package Hashmap;

import java.util.HashMap;

public class Count_special_triplets {

    static final long MOD = 1_000_000_007L;

    public static int specialTriplets(int[] nums) {

        int n = nums.length;

        HashMap<Integer, Long> left = new HashMap<>();
        HashMap<Integer, Long> right = new HashMap<>();

        for (int x : nums) {
            right.put(x, right.getOrDefault(x, 0L) + 1);
        }
        long ans = 0;

        for (int j = 0; j < n; j++) {

            right.put(nums[j], right.get(nums[j]) - 1);
            int target = nums[j] * 2;

            long prev = left.getOrDefault(target, 0L);
            long next = right.getOrDefault(target, 0L);

            ans = (ans + prev * next) % MOD;

            left.put(nums[j], left.getOrDefault(nums[j], 0L) + 1);
        }

        return (int) ans;
    }

    public static void main(String[] args) {
        int[] nums = {8, 4, 2, 8, 4};
        int ans = specialTriplets(nums);
        System.out.println(ans);
    }
}
