package Sliding_window;

public class Minimum_size_subarray_sum {

    static int minSubArrayLength(int[] nums,int target){

        int n = nums.length;

        int left = 0;
        int right = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;

        for(int i=0; i<n; i++){
            if(sum < target){
                sum += nums[i];
                right++;
            }
            while(sum >= target){
                minLength = Math.min(minLength,right-left);
                sum = sum - nums[left];
                left++;
            }
        }


        return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3};
        int target = 7;
        int ans = minSubArrayLength(nums,target);
        System.out.println(ans);
    }
}
