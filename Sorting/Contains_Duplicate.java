

import java.util.HashSet;

public class Contains_Duplicate {

    static boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return false; // Edge case: no duplicates in an empty or single-element array
        }

        // Use a HashSet to detect duplicates
        HashSet<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return true; // Duplicate found
            }
            seen.add(num);
        }
        return false; // No duplicates found
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 3};
        System.out.println(containsDuplicate(nums1)); 
    }
}
