package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

    static void helper(int[] nums,List<List<Integer>> list,List<Integer> subset,int idx){
        if(idx == nums.length){
            list.add(new ArrayList<>(subset)); // Add a copy
            return;
        }
        subset.add(nums[idx]);
        helper(nums, list, subset, idx+1);
        subset.remove(subset.size() - 1); // Backtrack (remove the last element)
        helper(nums, list, subset, idx+1);
    }

    static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        helper(nums,list,subset,0);
        return list;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> ans = subsets(nums);
        System.out.println(ans);
    }
}
