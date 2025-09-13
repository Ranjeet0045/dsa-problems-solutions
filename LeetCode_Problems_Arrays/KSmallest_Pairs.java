import java.util.ArrayList;
import java.util.List;


public class KSmallest_Pairs {

    static List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                List<Integer> temp = new ArrayList<>();
                temp.add(nums1[i]);
                temp.add(nums2[j]);
                list.add(temp);
            }
        }

        System.out.println(list);

        // Sort all pairs based on sum
        list.sort((a, b) -> (a.get(0) + a.get(1)) - (b.get(0) + b.get(1)));

        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < Math.min(k, list.size()); i++) {
            result.add(list.get(i));
        }
        return result;
    }

    public static void main(String[] args) {

        int[] nums1 = {1,1,2};
        int[] nums2 = {1,2,3};
        int k = 2;

        List<List<Integer>> ans = kSmallestPairs(nums1,nums2,k);
        System.out.println(ans);
    }
}
