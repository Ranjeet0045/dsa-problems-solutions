package Dynamic_programming.Memorization;

import java.util.Arrays;

public class number_of_paths_with_k_coins {


    //Memorization
    public static int helper(int[][] mat, int k, int row, int col, int sum, int[][][] dp) {
        int n = mat.length;
        int m = mat[0].length;

        if (row >= n || col >= m) return 0;

        sum += mat[row][col];

        // If sum exceeds k, no need to explore further
        if (sum > k) return 0;

        // If we reach the bottom-right cell
        if (row == n - 1 && col == m - 1)
            return (sum == k) ? 1 : 0;

        if (dp[row][col][sum] != -1)
            return dp[row][col][sum];

        int right = helper(mat, k, row, col + 1, sum, dp);
        int down = helper(mat, k, row + 1, col, sum, dp);

        return dp[row][col][sum] = right + down;
    }

    public static int numberOfPath(int[][] mat, int k) {
        int n = mat.length;
        int m = mat[0].length;

        // sum can go up to k, so create dp with that dimension
        int[][][] dp = new int[n][m][k + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }

        return helper(mat, k, 0, 0, 0, dp);
    }

    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3},
            {4, 6, 5},
            {3, 2, 1}
        };
        int k = 12;

        int ans = numberOfPath(mat, k);
        System.out.println(ans);
    }
}
