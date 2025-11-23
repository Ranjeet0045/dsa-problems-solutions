package Dynamic_programming.Memorization;

import java.util.Arrays;
import java.util.List;

public class Triangle {

    public static int find(List<List<Integer>> triangle, int i, int j, Integer[][] dp){
        if (i == triangle.size() - 1) {
            return triangle.get(i).get(j);
        }

        if (dp[i][j] != null) {
            return dp[i][j];
        }

        int x = triangle.get(i).get(j) + find(triangle, i + 1, j, dp);
        int y = triangle.get(i).get(j) + find(triangle, i + 1, j + 1, dp);

        dp[i][j] = Math.min(x, y);
        return dp[i][j];
    }

    public static int minimumTotal(List<List<Integer>> triangle) {
        int m = triangle.size();
        Integer[][] dp = new Integer[m][];
        
        for (int i = 0; i < m; i++) {
            dp[i] = new Integer[triangle.get(i).size()];
        }

        return find(triangle, 0, 0, dp);
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
