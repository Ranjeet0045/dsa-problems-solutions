package Prefix_sum;

import java.util.HashMap;

public class Make_sum_divisible_by_P {

    public static int minSubarray(int[] nums, int p) {
        int n = nums.length;

        long sum = 0;
        for(int num : nums){
            sum += num;
        }
        int target = (int)(sum % p);

        if(target == 0) return 0;

        HashMap<Integer,Integer> map = new HashMap<>();
        int minLength = n;

        int curr = 0;
        map.put(0,-1);

        for(int i=0; i<n; i++){
            curr = (curr + nums[i]) % p;
            int x = (curr -target + p) % p;

            if(map.containsKey(x)){
                minLength = Math.min(minLength,i - map.get(x));
            }
            map.put(curr, i);
        }

        return minLength == n ? -1 : minLength;
    }
    public static void main(String[] args) {
        int[] nums = {6,3,5,2};
        int p = 9;
        int ans = minSubarray(nums, p);
        System.out.println(ans);
    }
}
