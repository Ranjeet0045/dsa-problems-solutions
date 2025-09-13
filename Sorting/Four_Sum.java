import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Four_Sum {

    static List<List<Integer>> fourSum(int[] arr,int target){
        Arrays.sort(arr);
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(i>0 && arr[i]==arr[i-1]){
                continue;
            }
            for (int j = i+1; j < arr.length; j++) {
                if(j>i+1 && arr[j]==arr[j-1]){
                    continue;
                }
                int k = j+1;
                int l = arr.length-1;
                while(k<l){
                    long sum = (long)arr[i]+(long)arr[j]+(long)arr[k]+(long)arr[l];
                    if(sum < target){
                        k++;
                    }
                    else if(sum > target){
                        l--;
                    }
                    else{
                        list.add(Arrays.asList(arr[i],arr[j],arr[k],arr[l]));
                        k++;
                        l--;
                        while(k<l && arr[k]==arr[k-1]){
                            k++;
                        }
                    }
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] nums = {1,0,-1,0,-2,2};
        int target = 0;
        List<List<Integer>> ans = fourSum(nums,target);
        for (List<Integer> quadraplet : ans) {
            System.out.println(quadraplet);
        }
    }
}
