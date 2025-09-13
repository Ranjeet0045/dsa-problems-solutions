

// package Linear_Search;

import java.util.Arrays;

public class Search_2D_Array {
    public static void main(String[] args) {
        int[][] arr = {{1,6,4,8,9},{5,6,9,76},{34,12,65,67,89}};
        int target = 67;
        int[] ans = searchTarget(arr,target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] searchTarget(int[][] arr,int target){
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j]==target){
                    System.out.print("Present at index : ");
                    return new int[]{i , j};
                }
                
            }
        }
        return new int[]{-1, -1};
        }
}