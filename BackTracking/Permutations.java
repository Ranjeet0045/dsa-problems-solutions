package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    static void find(int[] nums,int idx,List<List<Integer>> list){
        if(idx == nums.length){
            List<Integer> temp = new ArrayList<>();
            for(int num : nums){
                temp.add(num);
            }
            list.add(temp);
            return;
        }
        for (int i = idx; i < nums.length; i++) {
            swap(nums,idx,i);
            find(nums,idx+1,list);
            swap(nums,idx,i);   //Backtracking
        }
    }

    static void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        find(nums,0,list);
        return list;
    }
    
    public static void main(String[] args) {
        int[] nums = {4};
        List<List<Integer>> ans = permute(nums);
        System.out.println(ans);
        
    }
}
