
import java.util.Arrays;

public class Maximum_sum_of_k_pairs {

    static int maxOperations(int[] nums, int k){
        Arrays.sort(nums);
        int count = 0;
        int i = 0;
        int j = nums.length-1;
        while(i < j){
            if(nums[i] + nums[j] == k){
                count++;
                i++;
                j--;
            }
            else if(nums[i] + nums[j] > k){
                j--;
            }
            else{
                i++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {4,4,1,3,1,3,2,2,5,5,1,5,2,1,2,3,5,4};
        int k = 2;
        int ans = maxOperations(arr,k);
        System.out.println(ans);
    }
}
