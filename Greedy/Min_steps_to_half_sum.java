package Greedy;

import java.util.Collections;
import java.util.PriorityQueue;

public class Min_steps_to_half_sum {

    public static int minOperations(int[] arr) {
        int minCount = 0;
        int n = arr.length;

        // Create a double copy to maintain fractional precision
        double[] copy = new double[n];
        double currSum = 0;
        PriorityQueue<Double> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            copy[i] = arr[i];
            currSum += copy[i];
        }

        for(int i=0; i<n; i++){
            pq.add(copy[i]);
        }

        double totalSum = 0;
        for (double num : pq) {
                totalSum += num;
            }

        double half = currSum / 2;

        while (currSum > half) {
            minCount++;
            currSum = 0;

            double max = pq.peek();
            pq.poll();
            pq.add(max/2.0);
            
            totalSum -= max/2.0;
            currSum = totalSum;
            
        }

        return minCount;
    }

    public static void main(String[] args) {
        int[] arr = {1, 9, 5, 4, 5, 6, 7, 4};
        int ans = minOperations(arr);
        System.out.println(ans);
    }
}
