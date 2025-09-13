
import java.util.Arrays;

public class Closest_three_Sum {

    static int threeSum(int[] arr,int target){
        Arrays.sort(arr);
        int res = 0;
        int gap  =Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int j = i+1;
            int k = arr.length - 1;
            while(j<k){
                int sum = arr[i] + arr[j] + arr[k];
                if(sum<target){
                    int newgap = target - sum;
                    if(newgap < gap){
                        gap = newgap;
                        res = sum;
                    }
                    j++;
                }
                else if(sum>target){
                    int newgap = sum - target;
                    if(newgap < gap){
                        gap = newgap;
                        res = sum;
                    }
                    k--;
                }
                else{
                    return sum;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {-1,2,1,-4};
        int target = 1;
        int ans = threeSum(arr,target);
        System.out.println(ans);
    }
}
