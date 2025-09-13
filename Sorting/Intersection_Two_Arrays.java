
import java.util.ArrayList;
import java.util.Arrays;

// package LeetCode_Problems_Sorting;

public class Intersection_Two_Arrays {

    static int[] intersection(int[] nums1,int[] nums2){
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0,j = 0;
        while(i < nums1.length && j < nums2.length){
            if(i > 0 && nums1[i] == nums1[i-1]){
                i++;
                continue;
           }
            if(nums1[i] == nums2[j]){
                list.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i] > nums2[j]){
                j++;
            }
            else{
                i++;
            }
        }
        int[] result = new int[list.size()];
        int k = 0;
        while (k < list.size()) {
            result[k] = list.get(k);
            k++;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {4,4,9,5};
        int[] nums2 = {9,4,9,8,4};
        int[] ans = intersection(nums1,nums2);
        System.out.println(Arrays.toString(ans));
    }
}
