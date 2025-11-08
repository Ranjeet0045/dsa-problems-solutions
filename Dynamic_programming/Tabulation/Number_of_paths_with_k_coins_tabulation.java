package Dynamic_programming.Tabulation;

public class Number_of_paths_with_k_coins_tabulation {

     public static int numberOfPath(int[][] mat, int k) {
        int n = mat.length;
        int m = mat[0].length;

        int[][][] dp = new int[n][m][k + 1];

        // Base case
        if (mat[0][0] <= k) {
            dp[0][0][mat[0][0]] = 1;
        }

        // Fill the DP table
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int sum = 0; sum <= k; sum++) {
                    if (i == 0 && j == 0) continue; // skip the starting cell

                    int val = mat[i][j];
                    if (sum >= val) {
                        if (i > 0)
                            dp[i][j][sum] += dp[i - 1][j][sum - val];
                        if (j > 0)
                            dp[i][j][sum] += dp[i][j - 1][sum - val];
                    }
                }
            }
        }

        return dp[n - 1][m - 1][k];
    }

    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3},
            {4, 6, 5},
            {3, 2, 1}
        };
        int k = 12;

        System.out.println(numberOfPath(mat, k));
    }
}
