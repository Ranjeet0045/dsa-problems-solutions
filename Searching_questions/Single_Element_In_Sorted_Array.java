public class Single_Element_In_Sorted_Array {

    static int singleNonDuplicate(int[] nums) {

        int i = 0;
        while(i < nums.length-1){
            if(nums[i] == nums[i+1]){
                i += 2;
            }
            else{
                return nums[i];
            }
        }
        return nums[nums.length - 1];
    }

    public static void main(String[] args) {
        int[] nums = {1};
        int ans = singleNonDuplicate(nums);
        System.out.println(ans);
    }
}
