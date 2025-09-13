
import java.util.ArrayList;
import java.util.Arrays;
// import java.util.HashSet;

public class InterSection_Of_two_Arrays {

    static int[] intersection(int[] nums1,int[] nums2){
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        // HashSet<Integer> set = new HashSet<>();
        int i = 0, j = 0;
        while(i < nums1.length && j < nums2.length){
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
        System.out.println(list);
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        int[] ans = intersection(nums1,nums2);
        System.out.println(Arrays.toString(ans)); 
    }
}
