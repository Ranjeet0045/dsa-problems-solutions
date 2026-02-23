package Graph.Cycle_Detection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Directed_graph {

    static boolean ans;
    //USING DFS
    private static boolean isCyclic2(int v, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        ans = true;   //true means no cycle

        for(int i=0; i<v; i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0; i<edges.length; i++){
            int a = edges[i][0], b = edges[i][1];
            adj.get(a).add(b);
        }
        boolean[] vis = new boolean[v];
        boolean[] path = new boolean[v];

        for(int i=0; i<v; i++){
            if(!vis[i]){
                dfs(i, adj, vis, path);
            }
        }
        return ans;
    }

    private static void dfs(int i, List<List<Integer>> adj, boolean[] vis, boolean[] path) {
        vis[i] = true;
        path[i] = true;

        for(int ele : adj.get(i)){
            if(path[ele] == true){
                ans = false;
                return;
            }
            if(!vis[ele]){
                dfs(ele, adj, vis, path);
            }
        }

        path[i] = false;
    }

    //USING BFS(KAHN"S ALGORITHM)
    public static boolean isCyclic1(int V, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0; i<V; i++){
            adj.add(new ArrayList<>());
        }
        //Build adjacency list and calculate indegree of all nodes
        int[] indegree = new int[V];
        for(int i=0; i<edges.length; i++){
            int a = edges[i][0], b = edges[i][1];
            adj.get(a).add(b);
            indegree[b]++;
        }

        //Push all nodes in queue with indegree zero
        Queue<Integer> q= new LinkedList<>();
        for(int i=0; i<V; i++){
            if(indegree[i] == 0) q.add(i);
        }

        //Kahn's algorithm
        List<Integer> ans = new ArrayList<>();
        while(!q.isEmpty()){
            int u = q.poll();
            ans.add(u);

            for(int i=0; i<adj.get(u).size(); i++){
                int v = adj.get(u).get(i);
                indegree[v]--;

                if(indegree[v] == 0) q.add(v);
            }
        }

        return ans.size() != V;
    }
    public static void main(String[] args) {
        int V = 4;
        int[][] edges = {{0, 1}, {1, 2}, {2, 0}, {2, 3}};
        System.out.println(isCyclic1(V, edges)); // true means cycle exist
        System.out.println(isCyclic2(V, edges)); // false means cycle exist
    }
}
