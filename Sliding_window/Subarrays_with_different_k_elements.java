package Sliding_window;

import java.util.HashMap;

public class Subarrays_with_different_k_elements {

    public static int subarraysWithKDistinct(int[] nums, int k) {
        return atMostKDistinct(nums, k) - atMostKDistinct(nums, k - 1);
    }

    private static int atMostKDistinct(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int left = 0, count = 0;

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

            while (map.size() > k) {
                map.put(nums[left], map.get(nums[left]) - 1);
                if (map.get(nums[left]) == 0)
                    map.remove(nums[left]);
                left++;
            }

            count += i - left + 1;
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 3, 4};
        int k = 3;
        int ans = subarraysWithKDistinct(nums, k);
        System.out.println(ans);
    }
}
