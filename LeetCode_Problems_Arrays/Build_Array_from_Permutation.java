
import java.util.Arrays;

public class Build_Array_from_Permutation {

    static int[] buildArray(int[] nums) {
        int n = nums.length;      
        int ans[] = new int[n];   
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {5,0,1,2,3,4};
        int[] result = buildArray(arr);
        System.out.println(Arrays.toString(result));
    }
}
