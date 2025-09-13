public class Richest_Customer_Wealth {

    static int maximumWealth(int[][] arr){
        int wealth  = -1;
        for (int i = 0; i < 3; i++) {
            int sum = 0;
            for (int j = 0; j < 3; j++) {
                sum += arr[i][j];
            }
            wealth = Math.max(wealth,sum);
        }
        return wealth;
    }

    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3},
            {3,5,4},
            {6,1,3}
        };
        int result = maximumWealth(arr);
        System.out.println(result);
    }
}
