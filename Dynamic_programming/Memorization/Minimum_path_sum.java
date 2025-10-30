package Dynamic_programming.Memorization;

import java.util.Arrays;

public class Minimum_path_sum {

    public static int helper(int row,int col,int m,int n,int[][] grid,int[][] dp){

        if (row == m && col == n) return grid[row][col];
        if (row > m || col > n) return (int) 1e9;
        if (dp[row][col] != -1) return dp[row][col];

        int down = grid[row][col] + helper(row + 1, col, m, n, grid, dp);
        int right = grid[row][col] + helper(row, col + 1, m, n, grid, dp);

        return dp[row][col] = Math.min(down, right);
    }

    public static int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m+1][n+1];
        for(int i=0; i<=m; i++){
            Arrays.fill(dp[i],-1);
        }

        return helper(0,0,m-1,n-1,grid,dp);
    }
    public static void main(String[] args) {
        int[][] grid = {{1,2,3},{4,5,6}};
        int ans = minPathSum(grid);
        System.out.println(ans);
    }
}
