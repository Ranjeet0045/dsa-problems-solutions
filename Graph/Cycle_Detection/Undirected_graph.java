package Graph.Cycle_Detection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Pair<K, V> {
    K key;
    V value;
    Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }
}

public class Undirected_graph {

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
        for(int i = 0; i < V; i++){
            if(!vis[i]){
                // Using BFS
                if(bfs(i, vis, adj)){
                    return true;
                }
                //Using DFS
                if(dfs(i, vis, adj, -1)){
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean dfs(int node, boolean[] vis,List<List<Integer>> adj, int parent) {
        vis[node] = true;

        for(Integer neighbor : adj.get(node)){

            if(!vis[neighbor]){
                if(dfs(neighbor, vis, adj, node))
                    return true;
            }
            else if(neighbor != parent){
                return true;
            }
        }

        return false;
    }

    private static boolean bfs(int i, boolean[] vis, List<List<Integer>> adj) {
        vis[i] = true;
        Queue<Pair<Integer, Integer>> queue = new LinkedList<>();
        queue.offer(new Pair<>(i, -1));

        while(!queue.isEmpty()){
            Pair<Integer,Integer> front = queue.remove();
            int node = front.key;
            int parent = front.value;

            for(Integer neighbor : adj.get(node)){
                if(!vis[neighbor]){
                    vis[neighbor] = true;
                    queue.offer(new Pair<>(neighbor, node));
                } 
                else if(neighbor != parent){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int V = 4;
        int edges[][] = {{0, 1}, {0, 2}, {1, 2}, {2, 3}};
        boolean ans = isCycle(V, edges);
        System.out.println(ans);
    }
}
