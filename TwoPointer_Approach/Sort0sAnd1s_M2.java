package TwoPointer_Approach;

public class Sort0sAnd1s_M2 {
    public static void main(String[] args) {
        int[] nums = {1,0,0,1,1,0,0,1};
        int n = nums.length;
        int left = 0 , right = n-1;
        while(left<right){
            if(nums[left] == 1 && nums[right] == 0){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
            if(nums[left]==0){
                left++;
            }
            if(nums[right]==1){
                right--;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
