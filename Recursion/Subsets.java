package Recursion;

import java.util.List;
import java.util.ArrayList;

public class Subsets {

    static List<List<Integer>> subset(int[] nums){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int num : nums) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        List<List<Integer>> result = subset(nums);
        for(List<Integer> list : result){
            System.out.print(list + " ");
        }
    }
}
