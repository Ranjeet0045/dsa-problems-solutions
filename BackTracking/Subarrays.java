package BackTracking;
import java.util.*;

public class Subarrays {
    public static List<List<Integer>> findSubarrays(int[] nums){
        List<List<Integer>> result = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            find(nums,i,i,new ArrayList<>(),result);
        }

        return result;
    }
    private static void find(int[] nums, int start, int idx, List<Integer> curr, List<List<Integer>> result) {
        if(idx == nums.length) return;

        curr.add(nums[idx]);
        result.add(new ArrayList<>(curr));  // Add Copy
        find(nums, start, idx + 1, curr, result);
        curr.remove(curr.size()-1);  // Backtrack
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        List<List<Integer>> ans = findSubarrays(nums);
        System.out.println(ans);
    }
}
