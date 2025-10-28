package Dynamic_programming.Tabulation;

public class Min_cost_climbing_stairs {
    static int helper(int[] cost){
        int n = cost.length;
        for(int i=2; i<n; i++){
            cost[i] += Math.min(cost[i-1],cost[i-2]);
        }
        return Math.min(cost[n-1],cost[n-2]);
    }
    public static void main(String[] args) {
        int[] cost = {1,100,1,1,1,100,1,1,100,1};
        int ans = helper(cost);
        System.out.println(ans);
    }
}
