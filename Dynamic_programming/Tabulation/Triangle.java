package Dynamic_programming.Tabulation;

import java.util.Arrays;
import java.util.List;

public class Triangle {

    public static int minimumTotal(List<List<Integer>> triangle) {
        int m = triangle.size();
        int[][] dp = new int[m][m]; // We can use a square matrix for simplicity

        // STEP 1: Initialize Base Case
        // The last row of DP table is just the values of the last row of the triangle
        // because there is nowhere else to go from there.
        for (int j = 0; j < triangle.get(m - 1).size(); j++) {
            dp[m - 1][j] = triangle.get(m - 1).get(j);
        }

        // STEP 2: The Loops (Bottom-Up)
        // We start from the second to last row and move UP to 0.
        // We do this because row 'i' needs data from row 'i+1'.
        for (int i = m - 2; i >= 0; i--) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                
                // STEP 3: Copy Logic
                // dp[i+1][j] is the element directly below
                // dp[i+1][j+1] is the element to the right diagonal
                int down = dp[i + 1][j];
                int diagonal = dp[i + 1][j + 1];

                dp[i][j] = triangle.get(i).get(j) + Math.min(down, diagonal);
            }
        }

        // STEP 4: The Result
        // The answer bubbles up to the top tip of the triangle.
        return dp[0][0];
    }
    public static void main(String[] args) {
        List<List<Integer>> triangle = Arrays.asList(
            Arrays.asList(2),
            Arrays.asList(3, 4),
            Arrays.asList(6, 5, 7),
            Arrays.asList(4, 1, 8, 3)
        );

        int ans = minimumTotal(triangle);
        System.out.println(ans);
    }
}
