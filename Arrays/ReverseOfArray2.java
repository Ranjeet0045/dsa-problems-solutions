

import java.util.Scanner;

public class ReverseOfArray2 {

    static int[] reverse(int[] arr){
        int n = arr.length;
        int j = 0;
        int[] ans = new int[n];
        for (int i = n-1; i >= 0; i--) {
            ans[j++] = arr[i];
            // j++;
        }
        return ans;
    }

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.print("Enter size of array : ");
       int n = in.nextInt();
       int[] arr = new int[n] ;
       System.out.print("Enter elements of array :" );
       for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
       }
       in.close();
        int[] ans = reverse(arr);
       System.out.print("Reversed array is :");
       for (int i = 0; i < arr.length; i++) {
            System.out.print(ans[i] + " ");
       }
    }
}
