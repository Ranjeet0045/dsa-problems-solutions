package Queue.Questions;

// import java.util.ArrayDeque;
import java.util.Arrays;
// import java.util.Deque;

public class Sliding_window_maximum {


    static int[] helper(int[] nums,int k){
        int n = nums.length;
        int[] ans = new int[n-k+1];

        // Deque<Integer> queue = new ArrayDeque<>();

        int max = nums[0];
        for(int i=0; i<k; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }
        // queue.addLast(max);
        int idx = 0;
        ans[idx] = max;

        for(int i=k; i<n; i++){
            idx++;
            if(nums[i] > max){
                ans[idx] = nums[i];
                max = nums[i];
            }
            else{
                ans[idx] = max;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;

        int[] ans = helper(nums,k);
        System.out.println(Arrays.toString(ans));
    }
}
