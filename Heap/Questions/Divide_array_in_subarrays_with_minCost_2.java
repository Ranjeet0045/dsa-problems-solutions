package Heap.Questions;

import java.util.Collections;
import java.util.PriorityQueue;

public class Divide_array_in_subarrays_with_minCost_2 {

    //This will give time limit exceeded for larger array size
    public static long minimumCost(int[] nums, int k, int dist) {
        
        PriorityQueue<Integer> chosen = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> extra = new PriorityQueue<>();

        long sum = 0;
        long result = Long.MAX_VALUE;
        int l = 1;
        
        for(int r=1; r<nums.length; r++){
            chosen.add(nums[r]);
            sum += nums[r];

            if(chosen.size() > k-1){
                int moved = chosen.poll();
                sum -= moved;
                extra.add(moved);
            }

            while(r-l > dist){
                int removed = nums[l];
                if(chosen.remove(removed)){
                    sum -= removed;
                }
                else{
                    extra.remove(removed);
                }

                if(chosen.size() < k-1 && !extra.isEmpty()){
                    int moved = extra.poll();
                    chosen.add(moved);
                    sum += moved;
                }
                l++;
            }
            if(chosen.size() == k-1){
                result = Math.min(result, nums[0] + sum);
            }
        }

        return result;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,2,6,4,2};
        int k = 3, dist = 3;
        long ans = minimumCost(nums, k, dist);
        System.out.println(ans);
    }
}
