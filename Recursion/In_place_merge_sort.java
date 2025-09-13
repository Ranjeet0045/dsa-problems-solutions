package Recursion;

import java.util.Arrays;

public class In_place_merge_sort {

  private static void merge(int[] arr,int start,int mid,int end){
        int i = start;
        int j = mid;
        int k = 0;
        int[] merged = new int[end-start];
        while(i < mid && j < end){
            if(arr[i] < arr[j]){
                merged[k] = arr[i];
                i++;
            }
            else{
                merged[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i < mid){
            merged[k] = arr[i];
            i++;
            k++;
        }
        while(j < end){
            merged[k] = arr[j];
            j++;
            k++;
        }
        for (int l = 0; l < merged.length; l++) {
            arr[start+l] = merged[l];
        }
    }

    static void Sort(int[] arr,int start,int end){
        if(end-start <= 1){
            return;
        }
        int mid = start + (end-start)/2;
        Sort(arr,start, mid);
        Sort(arr, mid, end);
        merge(arr,start,mid,end);
    }
    
   

    public static void main(String[] args) {
        int[] arr = {4,5,2,1,3};
        Sort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
