

public class ReverseOfArray1 {

    static void reverse(int[] arr){
       int i = arr.length-1;
       while(i>=0){
        System.out.print( arr[i] + " ");
        i--;
       }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        reverse(arr);
    }
}
