package Insertion_Sort;

import java.util.Arrays;

public class Main {

    static void InsertSort(int[] arr){
        int n = arr.length;
        for (int i = 1; i < n ; i++) {
            // for (int j = i + 1; j > 0; j--) {
            //     if(arr[j] < arr[j-1]){
            //         int temp = arr[j];
            //         arr[j] = arr[j-1];
            //         arr[j-1] = temp;
            //     }
            //     else{
            //         break;
            //     }
            // }
            int temp = arr[i];
            int j = i-1;
            while(j >= 0){
                if(arr[j] > temp){
                    arr[j+1] = arr[j];
                }
                else{
                    break;
                }
                j--;
            }
            arr[j+1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {6,5,8,1,3,4,2,7};
        InsertSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
