// Given an integer array nums of length n, you want to create an array ans of length 2n where a[i]       nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
// Specifically, ans is the concatenation of two nums arrays.
// Return the array ans



import java.util.Arrays;

public class ConcatenationOfArrays {

    static void getConcatenation(int[] arr1,int[] arr2){
        int size = arr1.length + arr2.length;
        int[] arr3 = new int[size];
        int j = arr1.length;
        for(int i =0; i < arr3.length; i++){
            if(i<arr1.length){
                arr3[i]=arr1[i];
            }
            if(i<arr2.length){
                arr3[j++]=arr2[i];
            }
          
        }
        // for (int i = 0; i < arr3.length; i++) {
        //     System.out.print(arr3[i] + " ");
        // }
        System.out.print("Concatenated array is : ");
        System.out.print(Arrays.toString(arr3));
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9,10};
        getConcatenation(arr1,arr2);
    }
}
