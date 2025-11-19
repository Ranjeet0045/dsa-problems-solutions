package Dynamic_programming.Memorization;

import java.util.Arrays;

public class Number_of_paths_of_checkpoints {

    public static int solve(int srow,int scol,int erow,int ecol,int[][] dp){
        if(srow == erow && scol == ecol) return 1;
        if(srow > erow || scol > ecol) return 0;

        if(dp[srow][scol] != -1) return dp[srow][scol];

        int bottom = solve(srow + 1, scol, erow, ecol, dp);
        int down = solve(srow, scol + 1, erow, ecol, dp);

        return dp[srow][scol] = down + bottom;
    }

    public static int find(int n, int[][] checkPoints){
        int ans = 1;
        int srow = 0, scol = 0;
        int[][] dp = new int[n+1][n+1];
        for(int i=0; i<=n; i++){
            Arrays.fill(dp[i],-1);
        }

        for(int i=0; i<checkPoints.length; i++){
            int erow = checkPoints[i][0];
            int ecol = checkPoints[i][1];
            ans *= solve(srow,scol,erow,ecol,dp);
            srow = erow;
            scol = ecol;
            for(int j=0; j<=n; j++){
            Arrays.fill(dp[j],-1);
        }
        }
        ans *= solve(srow, scol, n-1, n-1,dp);

        return ans;
    }

    public static void main(String[] args) {
        int n = 5;
        int[][] checkPoints = {{2,2}};
        int ans = find(n,checkPoints);
        System.out.println(ans);
    }
}
