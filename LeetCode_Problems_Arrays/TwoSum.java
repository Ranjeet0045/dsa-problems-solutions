

import java.util.Arrays;

public class TwoSum {

    //Brute force approach-> Bad time complexity->O(n^2);

    static int[] twoSum(int[] nums,int target){
        for (int i = 0; i < nums.length; i++) {
            int j = i+1;
            while(j<nums.length){
                if((nums[i] + nums[j]) == target){
                    return new int[]{i,j};
                }
                else{
                    j++;
                }
            }
        }
        return new int[]{-1,-1};
    }

    

    public static void main(String[] args) {
        int[] arr = {1,3,4,2};
        int target = 6;
        int[] ans = twoSum(arr,target);
        System.out.println(Arrays.toString(ans));
    }
}
