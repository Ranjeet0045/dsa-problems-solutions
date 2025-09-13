

import java.util.Scanner;

public class Sec_Large1 {

    static int SecLarge(int[] arr){
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                smax = max;
                max = arr[i];
            }
            else if (arr[i] > smax && arr[i] != max) {
                smax = arr[i];
            }
        }
        System.out.println("Second largest element is : " + smax);
        return smax;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter size of array : ");
        int n = in.nextInt();
        System.out.print("Enter elements in array:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        SecLarge(arr);
        in.close();
    }
}
