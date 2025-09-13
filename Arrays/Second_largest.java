public class Second_largest {

    static int find(int[] arr){
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE; 
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
           if(arr[i] > smax && arr[i] < max){
            smax = arr[i];
           } 
        }
        if(smax == Integer.MIN_VALUE){
            smax = -1;
        }
        return smax;
    }

    public static void main(String[] args) {
        int[] arr = {10};
        int ans = find(arr);
        System.out.println(ans);
    }
}
