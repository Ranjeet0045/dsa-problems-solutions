package Dynamic_programming.Memorization;

import java.util.Arrays;

public class champagne_tower {

    static double[][] memo;
    public static double champagneTower(int poured, int query_row, int query_glass) {
        memo = new double[query_row+1][query_row+1];
        for(int i=0; i<=query_row; i++){
            Arrays.fill(memo[i], -1.0);
        }
        double ans  = solve(poured, query_row, query_glass);
        return Math.min(1.0, ans);
    }
    private static double solve(int poured, int i, int j) {
        if(j < 0 || j > i) return 0.0;
        if(i == 0 && j == 0) return poured;
        
        if(memo[i][j] != -1.0) return memo[i][j];

        double left = solve(poured, i-1, j-1);
        double right = solve(poured, i-1, j);

        double res = 0.0;
        if(left > 1.0) res += (left - 1.0) / 2.0;
        if(right > 1.0) res += (right - 1.0) / 2.0;

        return memo[i][j] = res;
    } 
    public static void main(String[] args) {
        int poured = 2;
        int query_row = 1, query_glass = 1;
        System.out.println(champagneTower(poured, query_row, query_glass));
    }
}
