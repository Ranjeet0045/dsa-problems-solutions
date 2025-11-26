package Dynamic_programming.Memorization;

import java.util.Arrays;

public class Dungeon_game {

    public static int solve(int i, int j, int[][] dungeon, int[][] memo) {
        int m = dungeon.length;
        int n = dungeon[0].length;

        if (i >= m || j >= n) {
            return Integer.MAX_VALUE;
        }

        if (i == m - 1 && j == n - 1) {
            return Math.max(1, 1 - dungeon[i][j]);
        }

        if (memo[i][j] != -1) {
            return memo[i][j];
        }

        int goRight = solve(i, j + 1, dungeon, memo);
        int goDown  = solve(i + 1, j, dungeon, memo);

        int minNext = Math.min(goRight, goDown);

        int ans = Math.max(1, minNext - dungeon[i][j]);

        return memo[i][j] = ans;
    }

    public static int calculateMinimumHP(int[][] dungeon) {
        int m = dungeon.length;
        int n = dungeon[0].length;
        
        int[][] memo = new int[m][n];
        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }

        return solve(0, 0, dungeon, memo);
    }

    public static void main(String[] args) {
        int[][] dungeon = {{-2, -3, 3}, {-5, -10, 1}, {10, 30, -5}};
        int ans = calculateMinimumHP(dungeon);
        System.out.println(ans);
    }
}