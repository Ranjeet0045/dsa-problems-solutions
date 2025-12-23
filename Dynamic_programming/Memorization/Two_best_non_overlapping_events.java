package Dynamic_programming.Memorization;

import java.util.*;

public class Two_best_non_overlapping_events {

    public static int maxTwoEvents(int[][] events) {
        int n = events.length;
        int[][][] memo = new int[n][3][n+1];
        for(int i=0; i<memo.length; i++){
            for(int j=0; j<memo[i].length; j++){
                Arrays.fill(memo[i][j], -1);
            }
        }
        Arrays.sort(events, (a, b) -> Integer.compare(a[0], b[0]));
        int count = 0, lastEnd = -1, idx = 0;
        return solve(idx, count, lastEnd, events, memo);
    }
    private static int solve(int idx, int count, int lastEnd, int[][] events, int[][][] memo) {
        if(idx == events.length || count == 2){
            return 0;
        }
        if(memo[idx][count][lastEnd+1] != -1) return memo[idx][count][lastEnd+1];

        int skip = solve(idx + 1, count, lastEnd, events, memo);
        int take = 0;
        if(lastEnd == -1 || events[idx][0] >= events[lastEnd][1] + 1){
            take = events[idx][2] + solve(idx + 1, count + 1, idx, events, memo);
        }
        return memo[idx][count][lastEnd+1] = Math.max(skip, take);
    }
    public static void main(String[] args) {
        int[][] events = {{6,6,6},{7,9,4},{4,5,4},{3,7,9},{6,10,8},{4,7,6}};
        Arrays.sort(events, (a, b) -> Integer.compare(a[0], b[0]));
        int ans = maxTwoEvents(events);
        System.out.println(ans);
    }
}
