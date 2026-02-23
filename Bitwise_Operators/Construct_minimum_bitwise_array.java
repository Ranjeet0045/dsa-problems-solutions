import java.util.*;
import java.util.List;

public class Construct_minimum_bitwise_array {

    //BruteForce
    public static int[] minBitwiseArray(List<Integer> nums) {
        int[] ans = new int[nums.size()];
        Arrays.fill(ans, -1);

        for(int i=0; i<nums.size(); i++){
            int curr = nums.get(i);

            for(int j=0; j<=curr; j++){
                if((j | (j+1)) == nums.get(i)){
                    ans[i] = j;
                    break;
                }
            }
        }
        return ans;
    }

    //Optimised
    public static int[] OptimisedminBitwiseArray(List<Integer> nums){
        int[] ans = new int[nums.size()];

        for(int i=0; i<nums.size(); i++){
            int x = nums.get(i);

            if((x & 1) == 0){
                ans[i] = -1;
                continue;
            }
            int cnt = 0;
            int temp = x;

            while((temp & 1) == 1){
                cnt++;
                temp >>= 1;
            }
            ans[i] = x- (1 << (cnt - 1));
        }
        return ans;
    }
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2,3,5,7);

        System.out.println(Arrays.toString(minBitwiseArray(nums)));
        System.out.println(Arrays.toString(OptimisedminBitwiseArray(nums)));
    }
}
