package Linear_Search;

public class MaxWealth {

    static int maxWealth(int[][] arr){
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            int rowSum = 0;
            for(int j = 0; j < arr[i].length; j++){
                rowSum += arr[i][j];
            }
            if(rowSum > max){
                max = rowSum;
            }
    }
    System.out.print("Maximum wealth is : ");
    return max;
}

    public static void main(String[] args) {
        int[][] arr = {
            {2,4,1,5,6},
            {5,4,3,6,8},
            {5,2,7,4,9}
        };
        System.out.println(maxWealth(arr));
    }
}
