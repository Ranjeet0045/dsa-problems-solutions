import java.util.Arrays;

public class First_Last_Occurences {
    static int[] searchRange(int[] nums, int target) {
        int firstIndex = findFirstIndex(nums, target);
        int lastIndex = findLastIndex(nums, target);
        if (firstIndex == -1) {
            return new int[]{-1, -1};
        }
        return new int[]{firstIndex, lastIndex};
    }

    static int findFirstIndex(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int result = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                result = mid;
                end = mid - 1; // Move to left half for earlier occurrences
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return result;
    }

    static int findLastIndex(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int result = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                result = mid;
                start = mid + 1; // Move to right half for later occurrences
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2, 2};
        int target = 2;
        int[] ans = searchRange(arr, target);
        System.out.println(Arrays.toString(ans));
    }
}