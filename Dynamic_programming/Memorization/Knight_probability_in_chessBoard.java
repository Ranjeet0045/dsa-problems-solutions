package Dynamic_programming.Memorization;

import java.util.Arrays;

public class Knight_probability_in_chessBoard {

    public static double knightProbability(int n, int k, int row, int column) {
        double[][][] dp = new double[26][26][101];

        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[i].length; j++){
                Arrays.fill(dp[i][j],-1);
            }
        }
        return helper(n,row,column,k,dp);
    }

    public static double helper(int n,int i,int j,int k,double[][][] dp){
        if(i<0 || j<0 || i>=n || j>=n) return 0;
        if(k == 0) return 1;

        if(dp[i][j][k] > -0.9) return dp[i][j][k];

        double ans = 0.0;

        //8 cases b/c eight possible moves...
        ans += helper(n, i+1, j+2, k-1, dp)*(0.125);
        ans += helper(n, i+2, j+1, k-1, dp)*(0.125);
        ans += helper(n, i+1, j-2, k-1, dp)*(0.125);
        ans += helper(n, i+2, j-1, k-1, dp)*(0.125);
        ans += helper(n, i-1, j+2, k-1, dp)*(0.125);
        ans += helper(n, i-2, j+1, k-1, dp)*(0.125);
        ans += helper(n, i-1, j-2, k-1, dp)*(0.125);
        ans += helper(n, i-2, j-1, k-1, dp)*(0.125);

        return dp[i][j][k] = ans;
    }
    public static void main(String[] args) {
        int n = 3, k = 2, row = 0, column = 0;
        double ans = knightProbability(n, k, row, column);
        System.out.println(ans);
    }
}
