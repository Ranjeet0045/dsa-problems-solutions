package Simulation;

import java.util.*;

public class min_pair_removal_to_sort_array_2 {

    static class Pair{
        int sum;
        int left;

        Pair(int sum, int left){
            this.sum = sum;
            this.left = left;
        }
    }

    public static int minimumPairRemoval(int[] nums) {
        int n = nums.length;
        if(n <= 1) return 0;

        //Doubly linked list using arrays
        int[] left = new int[n];
        int[] right = new int[n];
        boolean[] alive = new boolean[n];

        for(int i=0; i<n; i++){
            left[i] = i-1;
            right[i] = i+1;
            alive[i] = true;
        }
        right[n-1] = -1;

        //minHeap: (sum, leftIndex)
        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a, b) -> {
                if(a.sum != b.sum) return a.sum - b.sum;
                return a.left - b.left;
            }
        );

        //Initial adjacent pairs
        for(int i=0; i<n-1; i++){
            pq.add(new Pair(nums[i] + nums[i+1], i));
        }

        int violations = 0;
        for (int i = 0; i < n; i++) {
            if (!alive[i]) continue;
            int j = right[i];
            if (j != -1 && nums[i] > nums[j]) {
                violations++;
            }
        }

        int opt = 0;

        //Function to check if array is nonDecreasing
        while(violations > 0){
            Pair p = pq.poll();
            int i = p.left;
            if(i == -1 || !alive[i]) continue;
            
            int j = right[i];
            if(j == -1 || !alive[j]) continue;

            //stale heap entry check
            if(nums[i] + nums[j] != p.sum) continue;

            //remove old violations
            if (left[i] != -1 && nums[left[i]] > nums[i]) violations--;
            if (nums[i] > nums[j]) violations--;
            if (right[j] != -1 && nums[j] > nums[right[j]]) violations--;

            //merge
            nums[i] = nums[i] + nums[j];
            alive[j] = false;

            //relink
            int r = right[j];
            right[i] = r;
            if(r != -1){
                left[r] = -1;
            }

            //add new violations
            if (left[i] != -1 && nums[left[i]] > nums[i]) violations++;
            if (right[i] != -1 && nums[i] > nums[right[i]]) violations++;

            //add new affected pairs
            if (left[i] != -1) {
                pq.add(new Pair(nums[left[i]] + nums[i], left[i]));
            }
            if (right[i] != -1) {
                pq.add(new Pair(nums[i] + nums[right[i]], i));
            }
            opt++;
        }

        return opt;
    }
    public static void main(String[] args) {
        int[] nums = {5,2,3,1};
        int ans = minimumPairRemoval(nums);
        System.out.println(ans);
    }
}
