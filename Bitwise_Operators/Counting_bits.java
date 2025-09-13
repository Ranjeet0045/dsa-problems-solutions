
import java.util.Arrays;

public class Counting_bits {

    static int[] bitsArray(int n){
        int[] arr = new int[n+1];
        int i = 0;
        while(i < arr.length){
            if(i == 0){
                arr[i] = 0;
                i++;
            }
            else{
                int j = i;
                int count = 0;
                while(j > 0){
                    if((j & 1) == 1){
                        count++;
                    }
                j = j >> 1;
            }
            arr[i] = count;
            i++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] ans = bitsArray(n);
        System.out.println(Arrays.toString(ans));
    }
}
