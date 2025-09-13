// Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
// Return the running sum of nums.



import java.util.Scanner;

public class RunningSumOf1DArray {

    static int[] runningSum(int[] nums){
        int[] ans = new int[nums.length];
        int x = 0;
        for (int i = 0; i < nums.length; i++) {
            ans[i] = x + nums[i];
            x = ans[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = in.nextInt();
        int[] nums = new int[size];
        System.out.print("Enter elements of array : ");
        for (int i = 0; i < size; i++) {
            nums[i] = in.nextInt();
        }
        int[] result = runningSum(nums);
        for(int i = 0;i < result.length; i++){
            System.out.print(result[i] + " ");
        }
        in.close();
    }
}
