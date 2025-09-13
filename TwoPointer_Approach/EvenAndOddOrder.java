package TwoPointer_Approach;

import java.util.Scanner;

public class EvenAndOddOrder {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.print("Enter size of array:");
       int x = in.nextInt();
       int[] arr = new int[x];
       System.out.print("Enter elements:");
       for (int i = 0; i < x; i++) {
        arr[i] = in.nextInt();
       }
       in.close();
       int n =arr.length;
       int left = 0, right = n-1;
       while(left<right){
        if(arr[left] % 2 != 0 && arr[right] % 2 == 0){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        left++;
        right--;
        }
        if(arr[left] % 2 == 0){
            left++;
        }
        if(arr[right] % 2 != 0){
            right--;
        }
       }
       for (int i = 0; i < x; i++) {
        System.out.print(arr[i] + " ");
       }
    }
}
