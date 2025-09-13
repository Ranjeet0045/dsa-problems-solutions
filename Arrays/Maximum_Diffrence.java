
public class Maximum_Diffrence {

    static int findMaxDiff(int[] arr) {
        int n=arr.length;
        int[] ls = new int[n];
        int[] rs = new int[n];
        for(int i=1;i<n;i++){
            ls[i]=0;
         for(int j=i-1;j>=0;j--){
             if(arr[j]<arr[i]){
                 ls[i]=arr[j];
                 break;
             }
         }   
        }
        for(int i=0;i<n;i++){
            rs[i]=0;
         for(int j=i+1;j<n;j++){
             if(arr[j]<arr[i]){
                 rs[i]=arr[j];
                 break;
             }
         }   
        }
        int maxDiff = 0;
        for (int i = 0; i < n; i++) {
            int diff = Math.abs(ls[i] - rs[i]);
            maxDiff = Math.max(maxDiff, diff);
        }

        return maxDiff;

    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 8, 7, 7, 9, 3};
        int ans = findMaxDiff(arr);
        System.out.println(ans);
    }
}
