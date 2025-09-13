package Recursion;

public class Sorted_array {

    static boolean check(int[] arr,int i){
        if(i == arr.length-1){
            return true;
        }
        return arr[i] < arr[i+1] && check(arr,i+1);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,5,7,9};
        int index = 0;
        System.out.println(check(arr,index));
    }
}
