package LeetCodeDailyQuestions;

public class August_19 {
    
    static long zeroFilledSubarray(int[] nums) {
        long count = 0; 
        long zeros = 0;

        for (int num : nums) {
            if (num == 0) {
                zeros++;
                count += zeros;
            } else {
                zeros = 0;
            }
        }
        
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,0,0,2,0,0,4};
        long ans = zeroFilledSubarray(nums);
        System.out.println(ans);
    }
}
