package Graph.Bellmon_ford;

import java.util.Arrays;

public class Main {

    public static int[] bellmanFord(int V, int[][] edges, int src) {
        int[] dist = new int[V];
        int INF = (int)1e8;
        Arrays.fill(dist, INF);
        dist[src] = 0;

        for(int x=1; x<=V-1; x++){
            for(int i=0; i<edges.length; i++){
                int u = edges[i][0];
                int v = edges[i][1];
                int wt = edges[i][2];

                if(dist[u] != INF && dist[u] + wt < dist[v]){
                    dist[v] = dist[u] + wt;
                }
            }
        }

        //For negative edge cycle:- If still updates after v-1 relaxations, then it contains negative cycle
        for(int i=0; i<edges.length; i++){
            int u = edges[i][0];
            int v = edges[i][1];
            int wt = edges[i][2];
            
            if(dist[u] != INF && dist[u] + wt < dist[v]){
                return new int[]{-1};
            }
        }
        return dist;
    } 
    public static void main(String[] args) {
        int V = 5;
        int[][] edges = {{1, 3, 2}, {4, 3, -1}, {2, 4, 1}, {1, 2, 1}, {0, 1, 5}};
        int src = 0;
        int[] ans = bellmanFord(V, edges, src);
        System.out.println(Arrays.toString(ans));
    }
}
