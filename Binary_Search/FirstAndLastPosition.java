package Binary_Search;

public class FirstAndLastPosition {

    // Method to find the first and last positions of a target in the array
    public int[] SearchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        // Find the first occurrence of the target
        int start = Search(nums, target, true);
        // Find the last occurrence of the target
        int end = Search(nums, target, false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }

    // Helper method to perform binary search and find the index
    // If FindStartIndex is true, it finds the first position of target
    // If FindStartIndex is false, it finds the last position of target
    private int Search(int[] nums, int target, boolean FindStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (FindStartIndex) {
                    end = mid - 1;  // Search for the first occurrence
                } else {
                    start = mid + 1;  // Search for the last occurrence
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 5, 6, 8, 8, 8, 9, 12, 14, 56};
        int target = 8;

        // Create an instance of FirstAndLastPosition
        FirstAndLastPosition obj = new FirstAndLastPosition();
        int[] ans = obj.SearchRange(nums, target);  // Corrected method call

        // Print the result
        System.out.println("First and Last position of target " + target + ": [" + ans[0] + ", " + ans[1] + "]");
    }
}

