package Dynamic_programming.Memorization;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Perfect_squares {

    public static int find(int idx, int n, List<Integer> list, int[][] memo){
        if(n == 0) return 0;
        if(idx >= list.size() || n < 0) return (int)1e9;

        if(memo[idx][n] != -1 ) return memo[idx][n];

        int pick = 1 + find(0, n - list.get(idx), list, memo);
        int notPick = find(idx+1, n, list, memo);

        return memo[idx][n] = Math.min(pick,notPick);
    }

    public static int numSquares(int n) {
        List<Integer> list = new ArrayList<>();

        for(int i=1; i<=n; i++){
            int num = (int)Math.sqrt(i);
            if(num*num == i) list.add(i);
        }
        System.out.println(list);
        int[][] memo = new int[list.size()+1][n+1];
        for(int i=0; i<memo.length; i++){
            Arrays.fill(memo[i],-1);
        }

        return find(0,n,list,memo);
    }
    public static void main(String[] args) {
        int n = 12;
        int ans = numSquares(n);
        System.out.println(ans);
    }
}
