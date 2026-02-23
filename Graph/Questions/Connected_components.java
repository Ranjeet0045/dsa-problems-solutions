package Graph.Questions;

import java.util.*;

public class Connected_components {

    private static ArrayList<ArrayList<Integer>> getComponents(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
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
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        solve(adj, vis, ans);
        return ans;
    }

    private static void solve(ArrayList<ArrayList<Integer>> adj, boolean[] vis, ArrayList<ArrayList<Integer>> ans) {
        int V = adj.size();

        for(int i=0; i<V; i++){
            if(!vis[i]){
                ArrayList<Integer> component = new ArrayList<>();
                dfs(i, adj, vis, component);
                ans.add(component);
            }
        }
    }

    private static void dfs(int node, ArrayList<ArrayList<Integer>> adj, boolean[] vis, ArrayList<Integer> component) {
        vis[node] = true;
        component.add(node);

        for(int i=0; i<adj.get(node).size(); i++){
            int neighbour = adj.get(node).get(i);
            if(!vis[neighbour]){
                dfs(neighbour, adj, vis, component);
            }
        }
    }

    public static void main(String[] args){
        int V = 5;
        int edges[][] = {{0, 1}, {2, 1}, {3, 4}};
        ArrayList<ArrayList<Integer>> ans = getComponents(V, edges);
        System.out.println(ans);
    }
}