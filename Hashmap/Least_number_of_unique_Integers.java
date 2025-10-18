package Hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Least_number_of_unique_Integers {
    
    public static int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        List<Integer> keys = new ArrayList<>(map.keySet());

        int[] nums = new int[map.size()];
        for(int i=0; i<nums.length; i++){
            Integer key = keys.get(i);
            nums[i] = map.get(key);
        }
        Arrays.sort(nums);

        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0) continue;
            if(k > 0){
                if(nums[i] > k){
                    nums[i] = nums[i] - k;
                }
                else{
                    k = k - nums[i];
                    nums[i] = 0;
                }
            }
        }

        int count = 0;
        for(int j=0; j<nums.length; j++){
            if(nums[j] > 0){
                count += 1;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {2,1,1,3,3,3};
        int k = 3;

        int ans = findLeastNumOfUniqueInts(arr,k);
        System.out.println(ans);
    }
}
