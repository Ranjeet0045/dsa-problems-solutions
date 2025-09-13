package Recursion;

import java.util.Arrays;

public class Merge_Sort {

    private static int[] merge(int[] first,int[] second){
        int i = 0;
        int j = 0;
        int k = 0;
        int[] merged = new int[first.length + second.length];
        while(i < first.length && j < second.length){
            if(first[i] < second[j]){
                merged[k] = first[i];
                i++;
            }
            else{
                merged[k] = second[j];
                j++;
            }
            k++;
        }
        while(i < first.length){
            merged[k] = first[i];
            i++;
            k++;
        }
        while(j < second.length){
            merged[k] = second[j];
            j++;
            k++;
        }
        return merged;
    }

    static int[] Sort(int[] arr){
        if(arr.length <= 1){
            return arr;
        }
        int mid = arr.length/2;
        int[] first = Sort(Arrays.copyOfRange(arr,0, mid));
        int[] second = Sort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(first,second);
    }
    
    public static void main(String[] args) {
        int[] arr = {8,3,4,12,5,6};
        int[] ans = Sort(arr);
        System.out.println(Arrays.toString(ans));
    }
}
