
import java.util.Arrays;

//LeetCode -> 2563

 //   BRUTEFORCE APPROACH

        // int pairs = 0;
        // for (int i = 0; i < nums.length - 1; i++) {
        //     for (int j = i + 1; j < nums.length; j++) {
        //         int ans = nums[i] + nums[j];
        //         if(ans >= lower && ans <= upper){
        //             pairs++;
        //         }
        //         // ans = 0;
        //     }
        // }
        // return pairs;


public class Count_Fair_Pairs {

    static int countFairPairs(int[] nums,int lower,int upper){

        // OPTIMISED APPROACH

        Arrays.sort(nums);
        int n = nums.length;
        long ans = 0;
        for (int i = 0; i < n - 1; i++) {
            int lb = lowerBound(nums,i+1,n,lower-nums[i]);
            int ub = upperBound(nums,i+1,n,upper-nums[i]);
            ans = ans + (ub - lb);
        }
        return (int) ans;
    }

        static int lowerBound(int[] nums,int start,int end,int target){
            while(start < end){
                int mid = start + (end - start) / 2;
            if (nums[mid] < target){
            start = mid + 1;
            }
            else
            {end = mid;
            }
        }
        return start;
    }


        static int upperBound(int[] nums,int start,int end,int target){
            while(start < end){
                int mid = start + (end - start) / 2;
            if (nums[mid] <= target){
            start = mid + 1;
            }
            else
            {end = mid;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,7,4,4,5};
        int lower = 3;
        int upper = 6;
        int ans = countFairPairs(nums,lower,upper);
        System.out.println(ans);
    }
}
