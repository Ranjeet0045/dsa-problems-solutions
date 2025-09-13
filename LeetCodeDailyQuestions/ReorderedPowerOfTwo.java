package LeetCodeDailyQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//reordered means koi number de rakha hai aur uske digits ko reorder karke dekhna hai ki wo power of two ban raha hai ki nahi...
// Aur ek baat- reordered number me koi bhi leading zero nahi hona chahiye...


public class ReorderedPowerOfTwo {

    static boolean reorderedPowerOf2(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(n);

        
        
        // Convert n to an array of its digits
        String nStr = String.valueOf(n);
        int[] digits = new int[nStr.length()];
        for (int i = 0; i < nStr.length(); i++) {
            digits[i] = nStr.charAt(i) - '0';
        }
        List<List<Integer>> ans = permuteUnique(digits);
        for (List<Integer> perm : ans) {
            // Skip permutations with leading zero
            if (perm.get(0) == 0) continue;
            // Convert list of digits to integer
            int num = 0;
            for (int d : perm) {
                num = num * 10 + d;
            }
            // Check if num is a power of two
            if ((num & (num - 1)) == 0) return true;
        }
        return false;
    }

    static void find(int[] nums, List<Integer> temp, boolean[] used, List<List<Integer>> result){
        
        if (temp.size() == nums.length) {
            result.add(new ArrayList<>(temp));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            // Skip used elements
            if (used[i]) continue;

            // Skip duplicates: only take the first among duplicates in each layer
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) continue;

            temp.add(nums[i]);
            used[i] = true;

            find(nums, temp, used, result);

            temp.remove(temp.size() - 1);
            used[i] = false;
        }
    }

    static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); // Sort to handle duplicates
        boolean[] used = new boolean[nums.length];
        find(nums, new ArrayList<>(), used, result);
        return result;
    }


    public static void main(String[] args) {
        int n = 46;
        boolean ans = reorderedPowerOf2(n);
        System.out.println(ans);
    }
}
