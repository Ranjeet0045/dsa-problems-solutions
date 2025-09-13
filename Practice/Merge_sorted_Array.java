import java.util.Arrays;

public class Merge_sorted_Array {

    static void merge(int[] nums1,int m,int[] nums2,int n){
        int idx = (m + n - 1);
        int i = m - 1,j = n - 1;
        while(i >= 0 && j >= 0){
            if(nums1[i] >= nums2[j]){
                nums1[idx] = nums1[i];
                idx--;
                i--;
            }
            else{
                nums1[idx] = nums2[j];
                idx--;
                j--;
            }
        }
        while(j >= 0){
            nums1[idx] = nums2[j];
            idx--;
            j--;
        }
    }

    public static void main(String[] args) {
       int[] nums1 = new int[6];  
        nums1[0] = 1; nums1[1] = 2; nums1[2] = 3;
        int[] nums2 = {4, 5, 7};
        merge(nums1, 3, nums2, 3);
        System.out.println("Merged Array: " + Arrays.toString(nums1));
     
    }
}
