

import java.util.Scanner;

public class TargetPairSum {

    static int pair(int[] arr,int x){
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j<arr.length; j++){
                if(arr[i] + arr[j] == x){
                    ans++;
                    System.out.println("("+arr[i] +"," + arr[j]+")");
                }
                
            }
        }
        System.out.print("Total pairs are :" + ans);
        return ans;
    }

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter size of array :");
            int y = in.nextInt();
            System.out.print("Enter elements of array :");
            int[] arr = new int[y];
            for (int i = 0; i < y; i++) {
                arr[i] = in.nextInt();
            }
            System.out.print("Enter the required sum :");
            int x = in.nextInt();
            pair(arr,x);
        }
    }
}
