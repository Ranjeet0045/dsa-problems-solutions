package Dynamic_programming.Memorization;

public class Minimum_Cost_Path_with_Teleportations {

    static int m, n;
    static Integer[][][] dp;

    public static int solve(int i, int j, int[][] grid, int k, Integer[][][] dp) {
        if (i >= m || j >= n) return Integer.MAX_VALUE;
        if (i == m - 1 && j == n - 1) return 0;

        if(dp[i][j][k] != null) return dp[i][j][k];
        int ans = Integer.MAX_VALUE;

        int down = solve(i + 1, j, grid, k, dp);
        if (down != Integer.MAX_VALUE)
            ans = Math.min(ans, grid[i + 1][j] + down);

        int right = solve(i, j + 1, grid, k, dp);
        if (right != Integer.MAX_VALUE)
            ans = Math.min(ans, grid[i][j + 1] + right);

        if (k > 0) {
            for (int x = i; x < m; x++) {
                for (int y = (x == i ? j + 1 : 0); y < n; y++) {
                    if (grid[x][y] <= grid[i][j]) {
                        int tele = solve(x, y, grid, k - 1, dp);
                        if (tele != Integer.MAX_VALUE)
                            ans = Math.min(ans, tele);
                    }
                }
            }
        }

        return dp[i][j][k] = ans;
    }

    public static int minCost(int[][] grid, int k) {
        m = grid.length;
        n = grid[0].length;
        dp = new Integer[m][n][k + 1];
        return solve(0, 0, grid, k, dp);    
    }

    public static void main(String[] args) {
        int[][] grid = {
            {1, 3, 3},
            {2, 5, 4},
            {4, 3, 5}
        };
        int k = 2;
        System.out.println(minCost(grid, k));
    }
}
