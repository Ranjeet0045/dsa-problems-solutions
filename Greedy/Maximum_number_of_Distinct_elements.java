package Greedy;

import java.util.Arrays;

public class Maximum_number_of_Distinct_elements {

    public static int maxDistinctElements(int[] nums, int k) {

        if (nums.length == 0) return 0;

        Arrays.sort(nums);  
        int count = 0;       
        int lastPlaced = Integer.MIN_VALUE / 2; 

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int minAllowed = num - k;
            int maxAllowed = num + k;

            int candidate = lastPlaced + 1;
            if (candidate < minAllowed) candidate = minAllowed;

            if (candidate <= maxAllowed) {
                count++;
                lastPlaced = candidate;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,2,3,3,4};
        int k = 2;
        int ans = maxDistinctElements(nums,k);
        System.out.println(ans);
    }
}
