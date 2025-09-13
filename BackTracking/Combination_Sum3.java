package BackTracking;

import java.util.ArrayList;
import java.util.List;

// Find all valid combinations of k numbers that sum up to n such that the following conditions true:
// Only numbers 1 through 9 are used.
// Each number is used at most once.
// Return a list of all possible valid combinations. The list must not contain the same combination twice, and the combinations may be returned in any order.


public class Combination_Sum3 {

    static void helper(int[] nums,int k,int target,int idx,List<Integer> comb,List<List<Integer>> ans){

        if(target < 0 || comb.size() > k){
            return;
        }
        if(target == 0 && comb.size() == k){
            ans.add(new ArrayList<>(comb));
            return;
        }
        for (int i = idx; i < nums.length; i++) {  
            if (nums[i] > target) break;
            comb.add(nums[i]);
            helper(nums, k, target-nums[i], i+1, comb, ans);
            comb.remove(comb.size() - 1);   //backtrack
        }

    }

    static List<List<Integer>> combinationSum3(int k, int n) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        List<Integer> comb = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        helper(nums,k,n,0,comb,result);
        return result;
    }
    public static void main(String[] args) {
        int k = 3;
        int n = 9;
        List<List<Integer>> ans = combinationSum3(k,n);
        System.out.println(ans);
    }
}
