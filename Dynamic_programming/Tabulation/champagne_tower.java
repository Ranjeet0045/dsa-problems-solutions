package Dynamic_programming.Tabulation;

public class champagne_tower {

    public static double champagneTower(int poured, int query_row, int query_glass) {
        double[] dp = new double[query_row + 2];
        dp[0] = poured;

        for(int i=0; i<query_row; i++){
            double[] next = new double[query_row+2];

            for(int j=0; j<=i; j++){
                if(dp[j] > 1.0){
                    double overflow = (dp[j] - 1.0) / 2.0;
                    next[j] += overflow;
                    next[j+1] += overflow;
                }
            }
            dp = next;
        }
        return Math.min(1.0, dp[query_glass]);
    }
    public static void main(String[] args) {
        int poured = 2;
        int query_row = 1, query_glass = 1;
        System.out.println(champagneTower(poured, query_row, query_glass));
    }
}
