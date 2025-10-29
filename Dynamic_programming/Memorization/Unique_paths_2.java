package Dynamic_programming.Memorization;

import java.util.Arrays;

public class Unique_paths_2 {

    public static int helper(int row,int col,int m,int n,int[][] grid,int[][] dp){
        if(grid[m][n] == 1) return 0;
        if(row == m && col == n) return 1;
        if(row > m || col > n) return 0;

        if(grid[row][col] == 1) return 0;

        if(dp[row][col] != -1) return dp[row][col];

        return dp[row][col] = helper(row+1,col,m,n,grid,dp) + helper(row, col+1, m, n, grid, dp);
    }

    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        int[][] dp = new int[m+1][n+1];
        for(int i=0; i<=m; i++){
            Arrays.fill(dp[i],-1);
        }

        return helper(0,0,m-1,n-1,obstacleGrid,dp);
    }
    public static void main(String[] args) {
        int[][] obstacleGrid = {{0,0,0},{0,1,0},{0,0,0}};
        int ans = uniquePathsWithObstacles(obstacleGrid);
        System.out.println(ans);
    }
}
