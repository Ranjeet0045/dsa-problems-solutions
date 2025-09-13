public class Pivot_in_rotated_sorted_array {

    static int findPivot(int[] nums) {
        int low = 0, high = nums.length - 1;
        if (nums[low] <= nums[high]) {
            return high;
        }
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (mid < high && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid > low && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }
            if (nums[mid] >= nums[low]) {
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {5, 6, 7, 1, 2, 3, 4};
        int pivot = findPivot(nums);
        System.out.println("Pivot index: " + pivot + ", value: " + nums[pivot]);
    }
}
