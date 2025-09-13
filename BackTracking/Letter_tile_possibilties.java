package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class Letter_tile_possibilties {

    static void find(String nums,int idx,List<List<Integer>> list){
        if(idx == nums.length()){
            StringBuilder temp = new StringBuilder();
            for (int i = 0; i < nums.length(); i++) {
                temp.append(nums.charAt(i));
            }
        //     list.add(temp);
        //     return;
        // }
        // for (int i = idx; i < nums.length(); i++) {
        //     swap(nums,idx,i);
        //     find(nums,idx+1,list);
        //     swap(nums,idx,i);   //Backtracking
        }
    }

    // static void swap(String nums,int i,int j){
    //     char temp = nums.charAt(i);
    //     nums.charAt(i) = nums.charAt(j);
    //     nums.charAt(j) = temp;
    // }

    static List<List<Integer>> permute(String nums) {
        List<List<Integer>> list = new ArrayList<>();
        find(nums,0,list);
        return list;
    }
    


    public static void main(String[] args) {
        String str = "AAB";
        List<List<Integer>> ans = permute(str);
        System.out.println(ans); 
    }
}
