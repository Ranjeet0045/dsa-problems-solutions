// package LeetCode_Problems_Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Three_Sum_Optimised {

    static List<List<Integer>> threeSum(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> list = new ArrayList<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if(i>0 && arr[i] == arr[i-1]){
                continue;
            }
            int j = i+1;
            int k = n-1;
            while(j < k){
                int sum = arr[i] + arr[j] + arr[k];
                if(sum > 0) k--;
                else if(sum < 0) j++;
                else{
                        list.add(Arrays.asList(arr[i],arr[j],arr[k]));
                        j++;
                        k--;
                        while(j<k && arr[j] == arr[j-1]){
                            j++;
                        }
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        List<List<Integer>> ans = threeSum(arr);
        for (List<Integer> triplet : ans) {
            System.out.println(triplet);
        }
    }
}
