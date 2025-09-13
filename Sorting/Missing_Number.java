

public class Missing_Number {

  static int missingNumber(int[] nums){
    int i = 0;
    while(i < nums.length){
        int correct = nums[i];
        if(nums[i] < nums.length && nums[i] != nums[correct]){
            int temp = nums[i];
            nums[i] = nums[correct];
            nums[correct] = temp;
        }
        else{
            i++;
        }
    }
    for (i = 0; i < nums.length; i++) {
      if (nums[i] != i) {
          return i; 
      }
  }
  return nums.length;
  }


    public static void main(String[] args) {
        int[] nums = {3,0,1};
        int ans = missingNumber(nums);
        System.out.println(ans); 
    }
}
