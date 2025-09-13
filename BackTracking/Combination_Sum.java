package BackTracking;

import java.util.*;

public class Combination_Sum {

    static void getAllCombinations(int[] arr,int idx,int target,List<List<Integer>> ans,List<Integer> comb){

        if(idx == arr.length || target < 0){
            return;
        }
        if(target == 0){
            ans.add(new ArrayList<>(comb));
            return;
        }

        comb.add(arr[idx]);

        

        //inclusion
        getAllCombinations(arr,idx,target-arr[idx],ans,comb);
        
        comb.remove(comb.size() - 1);
        
        //Exclusion
        getAllCombinations(arr,idx+1,target,ans,comb);

    }

    static List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> comb = new ArrayList<>();
        getAllCombinations(candidates,0,target,ans,comb);

        return ans; 
    }

    public static void main(String[] args) {

        int[] candidates = {2,3,6,7};
        int target = 7;

        System.out.println(combinationSum(candidates,target));

        // List<List<Integer>> result = combinationSum(candidates,target);
        // System.out.println(result);
    }
}
