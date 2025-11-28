package Graph.Questions;

import java.util.*;

public class Maximum_number_of_k_divisible_components {

    static int ans = 0;

    public static int maxKDivisibleComponents(int n, int[][] edges, int[] values, int k) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0; i<n; i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0; i<edges.length; i++){
            int a = edges[i][0], b = edges[i][1];
            adj.get(a).add(b);
            adj.get(b).add(a);
        }
        boolean[] vis = new boolean[n];

        dfs(adj,values,k,vis,0);
        return ans;
    }
    private static long dfs(List<List<Integer>> adj, int[] values, int k, boolean[] vis, int i) {
        vis[i] = true;
        long sum = values[i];

        for(int ele : adj.get(i)){
            if(!vis[ele]){
                sum += dfs(adj, values, k, vis, ele);
            }
        }

        if(sum % k == 0) ans++;
        return sum;
    }
    public static void main(String[] args) {
        int n = 7;
        int[][] edges = {{0,1},{0,2},{1,3},{1,4},{2,5},{2,6}};
        int[] values = {3,0,6,1,5,2,1};
        int k = 3;

        int ans = maxKDivisibleComponents(n, edges, values, k);
        System.out.println(ans);
    }
}
