
import java.util.Arrays;

public class Two_Sum {

    static int[] twoSum(int[] nums,int target){
        for (int i = 1; i <= nums.length; i++) {
            for (int j = i + 1; j <= nums.length; j++) {
                if((nums[i-1] + nums[j-1]) == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 13;
        int[] ans = twoSum(nums,target);
        System.out.println(Arrays.toString(ans));
    }
}
