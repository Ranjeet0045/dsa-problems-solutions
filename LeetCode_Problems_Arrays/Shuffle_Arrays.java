
import java.util.Arrays;

public class Shuffle_Arrays {

    static int[] shuffle(int[] nums,int n){
        int[] ans = new int[2*n];
        int i=0;
        int j=0;
        int k=n;
        while(i<2*n) {
            if((i%2)==0){
                ans[i]=nums[j];
                i++;
                j++;
            }
            else{
                ans[i]=nums[k];
                i++;
                k++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2,5,1,3,4,7};
        int n = arr.length/2;
        int[] result = shuffle(arr,n);
        System.out.println(Arrays.toString(result));
    }
}
