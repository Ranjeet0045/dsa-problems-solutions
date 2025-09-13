

import java.util.Scanner;

public class Sec_Large2 {

    static int max(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max=arr[i];
            }
        }
        return max;
    }

    static int Smax(int[] arr){
        int mx = max(arr);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == mx){
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int Smax = max(arr);
        System.out.print(Smax);
        return Smax;
    }

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter size of array : ");
            int n = in.nextInt();
            System.out.print("Enter elements in array:");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            Smax(arr);
        }
    }
}
