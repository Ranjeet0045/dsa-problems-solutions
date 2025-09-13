// package Cycle_Sort;

import java.util.Arrays;


public class Mnew {

    static void sort(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[correct] != arr[i]){
                int temp = arr[correct];
                arr[correct] = arr[i];
                arr[i] = temp;
            }
            else{
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,5,1,6,3,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
