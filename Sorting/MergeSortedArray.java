

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,6,8,0,0,0};
        int[] nums2 = {2,5,6};
        int count = 0;
        for (int i = 0; i < nums1.length; i++) { 
            if(nums1[i] > 0){
                nums1[i] = nums2[i];
                count = count + 1;
            }
            else{
                nums1[i] = nums2[i - count];
            }
        }
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums1.length - 1; j++) {
                if(nums1[j] > nums1[j+1]){
                    int temp = nums1[j];
                    nums1[j] = nums1[j+1];
                    nums1[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums1));
    }
}
