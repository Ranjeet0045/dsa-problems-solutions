package Graph.Topological_sort;

import java.util.*;

public class Using_dfs {

    public static ArrayList<Integer> topoSort(int V, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0; i<V; i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0; i<edges.length; i++){
            int u = edges[i][0];
            int v = edges[i][1];
            adj.get(u).add(v);
        }

        boolean[] vis = new boolean[V];
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0; i<V; i++){
            if (!vis[i]) {
                dfs(i, vis, ans, adj);
            }
        }
        Collections.reverse(ans);
        return ans;
    }
    private static void dfs(int i, boolean[] vis, ArrayList<Integer> ans, List<List<Integer>> adj) {
        vis[i] = true;

        for(int ele : adj.get(i)){
            if(!vis[ele]){
                dfs(ele, vis, ans, adj);
            }
        }
        ans.add(i);
    }
    public static void main(String[] args) {
        int V = 4;
        int edges[][] = {{3, 0}, {1, 0}, {2, 0}};
        ArrayList<Integer> ans = topoSort(V, edges);
        System.out.println(ans);
    }
}
