package BackTracking;

import java.util.ArrayList;

public class Subsets_sum {
    public ArrayList<Integer> subsetSums(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        
        helper(arr,list,0,0);
        return list;
    }
    
    public void helper(int[] arr,ArrayList<Integer> list,int sum,int idx){
        if(idx == arr.length-1){
            list.add(sum);
            return;
        }
        helper(arr,list,sum,idx+1);
        helper(arr,list,sum + arr[idx],idx+1);
    }
}
