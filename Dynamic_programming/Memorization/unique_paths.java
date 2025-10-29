package Dynamic_programming.Memorization;

import java.util.Arrays;

public class unique_paths {

    public static int helper(int row,int col,int m,int n,int[][] dp){
        if(row == m && col == n){
            return 1;
        }
        if(row > m || col > n){
            return 0;
        }
        if(dp[row][col] != -1) return dp[row][col];

        return dp[row][col] = helper(row+1,col,m,n,dp) + helper(row,col+1,m,n,dp);
    }
    public static int uniquePaths(int m, int n) {

        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) { //This loop is used to put -1 at all indices of 2D-dp
            Arrays.fill(dp[i], -1);
        }

        return helper(0,0,m-1,n-1,dp);
    }

    public static void main(String[] args) {
        int m = 3;
        int n = 7;

        int ans = uniquePaths(m,n);
        System.out.println(ans);
    }
}
