public class Equal_subarray_sum {
    public static void main(String[] args) {
        int[] arr = {9, 3, 4, 3, 2};
        int idx = solve(arr);
        if(idx != -1){
            for(int i=0; i<idx; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            for(int j=idx+1; j<arr.length; j++){
                System.out.print(arr[j] + " ");
            }
        }
        else{
            System.out.println("-1");
        }
    }

    private static int solve(int[] arr) {
        int n = arr.length;

        int sum = 0;
        for(int num : arr){
            sum += num;
        }

        int curr = 0;
        for(int i=0; i<n; i++){
            if(sum - (curr + arr[i]) == curr){
                return i;
            }
            curr += arr[i];
        }

        return -1;
    }
}
