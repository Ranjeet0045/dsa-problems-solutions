package Sliding_window;

public class Subarray_product_less_than_k {

    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k <= 1) return 0;
        int l=0, count=0;
        long pdt=1;
        int n = nums.length;

        for(int r=0; r<n; r++){
           pdt *= nums[r];

           while(pdt >= k){
                pdt /= nums[l];
                l++;
            }
            count += r - l + 1;
        }

        return count;
    }
    public static void main(String[] args) {
        int[] nums = {10,5,2,6};
        int k = 100;
        int ans = numSubarrayProductLessThanK(nums, k);
        System.out.println(ans);
    }
}
