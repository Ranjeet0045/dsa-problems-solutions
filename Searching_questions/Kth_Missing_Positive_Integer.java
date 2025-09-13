

public class Kth_Missing_Positive_Integer{

    static int findKthPositive(int[] arr,int k){
        int p = 1,q = 0,r = 0;
        while (true) {
            if (q < arr.length && arr[q] == p) {
                q++; 
            } else {
                r++; 
                if (r == k) {
                    return p; 
                }
            }
            p++; 
        }    
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int k = 2;
        int ans = findKthPositive(arr,k);
        System.out.println(ans);
    }
}