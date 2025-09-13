package Binary_Search;

public class Search_in_rotated_sorted_array {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8,1,2,2,3};
        int target = 5;

        int pivot = findPivot(arr);

        int start = 0, end = arr.length-1;
        if(arr[0] <= target && target <= arr[pivot]){
            end = pivot;
        }else{
            start = pivot + 1;
        }

        boolean ans = helper(arr,target,start,end); 
        System.out.println(ans);

    }
    public static int findPivot(int[] nums) {
        int start = 0, end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && nums[mid] > nums[mid + 1]) return mid;
            if (mid > start && nums[mid] < nums[mid - 1]) return mid - 1;

            if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
                if (start < end && nums[start] > nums[start + 1]) return start;
                start++;
                if (end > start && nums[end - 1] > nums[end]) return end - 1;
                end--;
            } 
            else if (nums[start] <= nums[mid]) {
                start = mid + 1;
            } 
            else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static boolean helper(int[] nums, int target, int start, int end) {
        if (start > end) return false;

        int mid = start + (end - start) / 2;
        if (nums[mid] == target) return true;

        if (nums[mid] > target) {
            return helper(nums, target, start, mid - 1);
        } else {
            return helper(nums, target, mid + 1, end);
        }
    }
}
