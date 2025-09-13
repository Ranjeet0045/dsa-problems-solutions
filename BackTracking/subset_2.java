package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subset_2 {

    static void helper(int[] nums,List<List<Integer>> list,List<Integer> subset,int idx){
        if(idx == nums.length){
            list.add(new ArrayList<>(subset)); // Add a copy
            return;
        }
        subset.add(nums[idx]);
        helper(nums, list, subset, idx+1);
        subset.remove(subset.size() - 1); // Backtrack (remove the last element)
        int i = idx + 1;
        while(idx < nums.length-1 && nums[i] == nums[i-1]){
            idx++;
        }
        helper(nums, list, subset, idx+1);
    }


    static List<List<Integer>> subset(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        helper(nums,list,subset,0);
        return list;
    }
    public static void main(String[] args) {
        int[] nums = {4,4,4,1,4};
        Arrays.sort(nums);
        List<List<Integer>> ans = subset(nums);
        System.out.println(ans);
    }
}
