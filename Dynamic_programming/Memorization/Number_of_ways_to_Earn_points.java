package Dynamic_programming.Memorization;

public class Number_of_ways_to_Earn_points {

    static int mod = 1000000007;

    public static int solve(int target, int[][] types, int idx, Integer[][] memo){
        if (target == 0) return 1;
        if (idx == types.length) return 0;

        if(memo[target][idx] != null) return memo[target][idx];

        int pick = 0;
        for(int i=1; i<=types[idx][0]; i++){

            int newTarget = target - i*types[idx][1];
            if(newTarget >= 0){
                pick = (pick + solve(newTarget, types, idx+1, memo)) % mod;
            }
            else{
                break;
            }
        }
        int notPick = solve(target, types, idx + 1, memo);

        return memo[target][idx] = (pick + notPick) % mod;
    }

    public static int waysToReachTarget(int target, int[][] types) {
        Integer[][] memo = new Integer[target+1][types.length+1];
        
        return solve(target,types,0, memo);
    }
    public static void main(String[] args) {
        int target = 6;
        int[][] types = {{6,1},{3,2},{2,3}};
        int ans = waysToReachTarget(target, types);
        System.out.println(ans);
    }
}
