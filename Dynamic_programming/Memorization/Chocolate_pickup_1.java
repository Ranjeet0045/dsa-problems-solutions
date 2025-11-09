package Dynamic_programming.Memorization;

import java.util.Arrays;

public class Chocolate_pickup_1 {

    public static int maxChocolate(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        // 3D DP array because both robots have independent columns
        int[][][] dp = new int[m][n][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }

        // Start both robots at (0,0) and (0,n-1)
        return findMax(grid, 0, 0, n - 1, dp);
    }

    public static int findMax(int[][] grid,int row,int col1,int col2,int[][][] dp) {
        int m = grid.length;
        int n = grid[0].length;

        // Out of bounds
        if (col1 < 0 || col1 >= n || col2 < 0 || col2 >= n)
            return Integer.MIN_VALUE;

        // Base condition: last row
        if (row == m - 1) {
            if (col1 == col2)
                return grid[row][col1];
            else
                return grid[row][col1] + grid[row][col2];
        }

        // Memoization check
        if (dp[row][col1][col2] != -1)
            return dp[row][col1][col2];

        int value = (col1 == col2) ? grid[row][col1] : grid[row][col1] + grid[row][col2];

        // Explicitly calculate all 9 possible move combinations for both robots
        int DownLeft_DownLeft = value + findMax(grid,row + 1,col1 - 1,col2 - 1,dp);
        int DownLeft_Down = value + findMax(grid,row + 1,col1 - 1,col2,dp);
        int DownLeft_DownRight = value + findMax(grid,row + 1,col1 - 1,col2 + 1,dp);

        int Down_DownLeft     = value + findMax(grid,row + 1,col1,col2 - 1,dp);
        int Down_Down = value + findMax(grid,row + 1,col1,col2,dp);
        int Down_DownRight = value + findMax(grid,row + 1,col1,col2 + 1,dp);

        int DownRight_DownLeft = value + findMax(grid,row + 1,col1 + 1,col2 - 1,dp);
        int DownRight_Down = value + findMax(grid,row + 1,col1 + 1,col2,dp);
        int DownRight_DownRight = value + findMax(grid,row + 1,col1 + 1,col2 + 1,dp);

        // Take the maximum among all 9 combinations
        int max = Math.max(
                    Math.max(Math.max(DownLeft_DownLeft, DownLeft_Down), Math.max(DownLeft_DownRight, Down_DownLeft)),
                    Math.max(Math.max(Down_Down, Down_DownRight),
                    Math.max(Math.max(DownRight_DownLeft, DownRight_Down), DownRight_DownRight))
                 );

        return dp[row][col1][col2] = max;
    }

    public static void main(String[] args) {
        int[][] grid = {
            {4, 1, 2},
            {3, 6, 1},
            {1, 6, 6},
            {3, 1, 2}
        };

        int ans = maxChocolate(grid);
        System.out.println(ans);
    }
}
