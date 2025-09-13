

public class Types_of_Triangle {

    static String triangleType(int[] nums){
        String ans;
        // Arrays.sort(nums);
        if(nums[0] == nums[1] && nums[1] == nums[2]){
            ans = "Equilateral triangle";
        }
        else if(nums[0] == nums[1] && (nums[0] + nums[1]) > nums[2] || nums[1] == nums[2] && (nums[1] + nums[2]) > nums[0] || nums[2] == nums[0] && (nums[0] + nums[2]) > nums[1]){
            ans = "Issosceles triangle";
        }
        else if((nums[0] + nums[1]) > nums[2] && (nums[1] + nums[2]) > nums[0] && (nums[0] + nums[2]) > nums[1]){
            ans = "Scalane triangle";
        }
        else{
            ans = "Does not form a triangle";
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {8,4,4};
        String ans = triangleType(nums);
        System.out.println(ans);
    }
}
