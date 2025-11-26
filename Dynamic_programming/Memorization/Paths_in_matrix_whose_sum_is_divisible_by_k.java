package Dynamic_programming.Memorization;

public class Paths_in_matrix_whose_sum_is_divisible_by_k {

    static int MOD = 1000000007;
    public static int solve(int m, int n, int[][] grid,int k, int sum, Integer[][][] dp){
        if(m < 0 || n < 0){
            return 0;
        }
        if(m == 0 && n == 0){
            return ((sum + grid[0][0]) % k == 0) ? 1 : 0;
        }

        int rem = sum % k; 
        if(dp[m][n][rem] != null) return dp[m][n][rem];
        
        int right = solve(m-1, n, grid, k, sum + grid[m][n], dp);
        int down = solve(m, n-1, grid, k, sum + grid[m][n], dp);

        return dp[m][n][rem] = (int)(((long)right + down) % MOD);
    }

    public static int numberOfPaths(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        Integer[][][] dp = new Integer[m][n][k];
        return solve(m-1,n-1,grid,k,0,dp);
    }
    public static void main(String[] args) {
        int[][] grid = {{5,2,4},{3,0,5},{0,7,2}};
        int k = 3;
        int ans = numberOfPaths(grid, k);
        System.out.println(ans);
    }
}
