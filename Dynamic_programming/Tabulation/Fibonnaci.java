package Dynamic_programming.Tabulation;

public class Fibonnaci {

    public static int fibo(int n){
        if(n <= 1) return n;
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;

        for(int i=2; i<=n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }
    public static void main(String[] args) {
        int n = 5;
        int ans = fibo(n);
        System.out.println(ans);
    }
}
