package Greedy;

import java.util.PriorityQueue;

public class Maximize_sum_after_k_negations {

    public static int largestSumAfterKNegations(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Step 1: Add all numbers to a min-heap
        for (int num : nums) {
            pq.add(num);
        }

        // Step 2: Flip the smallest element k times
        while (k > 0) {
            int smallest = pq.poll();
            pq.add(-smallest);
            k--;
        }

        // Step 3: Compute final sum
        int sum = 0;
        for (int num : pq) {
            sum += num;
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {4, 2, 3};
        int k = 1;
        int ans = largestSumAfterKNegations(nums, k);
        System.out.println(ans);
    }
}
