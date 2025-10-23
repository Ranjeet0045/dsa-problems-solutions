
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// package LeetCode_Problems_Sorting;

public class Three_Sum_Bruteforce {

    @SuppressWarnings({ "rawtypes", "unchecked" })
    static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        int i=0;
        int n = nums.length;
        while(i < n){
            int j = i+1;
            while(j < n){
                int k = j+1;
                while(k < n){
                    if(nums[i] + nums[j] + nums[k] == 0){
                        List<Integer> triplet = Arrays.asList(nums[i],nums[j],nums[k]);
                        set.add(triplet);
                    }
                    k++;
                }
                j++;
            }
            i++;
        }
        return new ArrayList(set);
    }

    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        List<List<Integer>> ans = threeSum(arr);
        for (List<Integer> triplet : ans) {
            System.out.println(triplet);
        }
    }
}

