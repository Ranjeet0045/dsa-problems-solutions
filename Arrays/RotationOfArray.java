
import java.util.Scanner;

public class RotationOfArray {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.print("Enter size of array : ");
       int n = in.nextInt();
       int[] arr = new int[n] ;
       System.out.print("Enter elements of array :" );
       for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
       }
       System.out.print("Enter desired steps of rotation:");
       int k = in.nextInt();
       k = k % n;
       in.close();
       int[] ans = new int[n];
       System.out.print("Rotated array is :");
       int j = 0;
       for (int i = n-k; i < n; i++) {
          ans[j] = arr[i];
          j++;
       }
       for (int i = 0; i < n-k; i++) {
          ans[j] = arr[i];
          j++; 
       }
       for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
       }
    }
}
