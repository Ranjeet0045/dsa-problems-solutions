package Graph.Questions;

import java.util.*;

public class Undirected_graph_cycle {

    public static boolean isCycle(int V, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        int m = edges.length;

        for(int i=0; i<V; i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0; i<m; i++){
            int a = edges[i][0], b = edges[i][1];
            adj.get(a).add(b);
            adj.get(b).add(a);
        }
        boolean[] vis = new boolean[V];

        for(int i=0; i<V; i++){
            if(!vis[i]){
                if(dfs(i, vis, adj, -1)){
                    return true;
                }
            }
        }
        return false;
    }
    private static boolean dfs(int node, boolean[] vis, List<List<Integer>> adj, int parent) {
        vis[node] = true;

        for(Integer neighbour : adj.get(node)){
            if(!vis[neighbour]){
                dfs(neighbour, vis, adj, node);
                return true;
            }
            else if(neighbour != parent){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int V = 4, edges[][] = {{0, 1}, {0, 2}, {1, 2}, {2, 3}};
        boolean ans = isCycle(V, edges);
        System.out.println(ans);
    }
}
