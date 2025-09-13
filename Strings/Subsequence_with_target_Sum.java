import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Subsequence_with_target_Sum {

    static int numSubseq(int[] nums, int target) {

        int ans = 0;
        Arrays.sort(nums);

        List<List<Integer>> list = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                temp.add(nums[i]);
                temp.add(nums[j]);
            }
            list.add(temp);
        }
        System.out.println(temp);
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {3,3,6,8};
        int target = 10;

        int ans = numSubseq(nums, target);
        System.out.println(ans);
    }
}
