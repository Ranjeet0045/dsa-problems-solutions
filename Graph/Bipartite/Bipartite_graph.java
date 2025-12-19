package Graph.Bipartite;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Bipartite_graph {

    static boolean ans;

    public static boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] vis = new int[n];
        Arrays.fill(vis,-1);
        ans = true;
        
        for(int i=0; i<n; i++){
            if(!ans) return ans;
            if(vis[i] == -1){
                bfs(i, vis, graph);
                dfs(i, vis, graph);
            }
        }

        return ans;
    }

    private static void dfs(int node, int[] vis, int[][] graph) {
        if(!ans) return;
        if(vis[node] == -1) vis[node] = 0; // default color

        for(int ele : graph[node]) {
            if(vis[ele] == -1) {
                vis[ele] = 1 - vis[node];
                dfs(ele, vis, graph);
                if(!ans) return;
            } 
            else if(vis[ele] == vis[node]) {
                ans = false;
                return;
            }
        }
    }

    private static void bfs(int i, int[] vis, int[][] adj) {
        Queue<Integer> queue = new LinkedList<>();
        vis[i] = 0; //  1 -> Red , 0 -> Blue
        queue.add(i);

        while(!queue.isEmpty()){
            int front = queue.remove();
            int color = vis[front];

            for(int ele : adj[front]){
                if(vis[ele] == vis[front]){
                    ans = false;
                    return;
                }
                if(vis[ele] == - 1){
                    vis[ele] = 1-color;
                    queue.add(ele);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] graph = {{1,2,3},{0,2},{0,1,3},{0,2}};
        boolean ans = isBipartite(graph);
        System.out.println(ans);
    }
}
