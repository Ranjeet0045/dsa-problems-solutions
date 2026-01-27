package Simulation;

import java.util.*;

public class min_pair_removal_to_sort_array {

    // BruteForce
    public static int minimumPairRemoval(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }
        int count = 0;
        while (true) {
            boolean sorted = true;
            for (int i = 0; i < list.size() - 1; i++) {
                if (list.get(i) > list.get(i + 1)) {
                    sorted = false;
                    break;
                }
            }

            if (sorted) break;
            int minSum = Integer.MAX_VALUE;
            int index = -1;

            for (int i = 0; i < list.size() - 1; i++) {
                int sum = list.get(i) + list.get(i + 1);
                if (sum < minSum) {
                    minSum = sum;
                    index = i;
                }
            }

            list.set(index, minSum);
            list.remove(index + 1);
            count++;
        }
        return count;
    }

    //Optimised
    // public static int OptimisedminimumPairRemoval(int[] nums){
    //     int count = 0;
    // }
    public static void main(String[] args) {
        int[] nums = {5,2,3,1};
        System.out.println(minimumPairRemoval(nums));
        // System.out.println(OptimisedminimumPairRemoval(nums));
    }
}
