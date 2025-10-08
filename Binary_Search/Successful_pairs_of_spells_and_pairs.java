package Binary_Search;

import java.util.Arrays;

public class Successful_pairs_of_spells_and_pairs {

    //BruteForce approach
    // public static int[] successfulPairs(int[] spells, int[] potions, long success) {
    //     ArrayList<Integer> list = new ArrayList<>();
    //     int count = 0;

    //     for(int i=0; i<spells.length; i++){
    //         for(int j=0; j<potions.length; j++){
    //             if(spells[i] * potions[j] > success){
    //                 count++;
    //             }
    //         }
    //         list.add(count);
    //         count = 0;
    //     }

    //     int[] ans = new int[list.size()];
    //     for(int i=0; i<list.size(); i++){
    //         ans[i] = list.get(i);
    //     }

    //     return ans;
    // }

    //Optimal Approach
    public static int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions); 
        int n = spells.length;
        int[] ans = new int[n];
        
        for (int i = 0; i < n; i++) {
            long requiredPotion = (success + spells[i] - 1) / spells[i];
            
            int left = 0, right = potions.length - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (potions[mid] >= requiredPotion) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            
            ans[i] = potions.length - left;
        }
        
        return ans;
    }

    public static void main(String[] args) {
        int[] spells = {5,1,3};
        int[] potions = {1,2,3,4,5};
        long success = 7;

        int[] ans = successfulPairs(spells,potions,success);
        System.out.println(Arrays.toString(ans));
    }
}
