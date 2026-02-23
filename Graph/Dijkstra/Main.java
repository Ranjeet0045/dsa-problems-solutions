package Graph.Dijkstra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Main {

    //Custom pair class with comparator
    static class Pair implements Comparable<Pair>{
        int node;
        int dist;
        public Pair(int dist, int node){
            this.dist = dist;
            this.node = node;
        }

        public int compareTo(Pair p){
            if(this.dist == p.dist) return this.node - p.node;
            return this.dist - p.dist;
        }
    }

    public static int[] dijkstra(int V, int[][] edges, int src) {
        int n = edges.length;
        List<List<Pair>> adj = new ArrayList<>();
        for(int i=0; i<V; i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0; i<n; i++){
            int a = edges[i][0], b = edges[i][1], c = edges[i][2];
            adj.get(a).add(new Pair(c, b));
            adj.get(b).add(new Pair(c, a));
        }

        //Distance array
        int[] dist = new int[V];
        for(int i=0; i<V; i++){
            dist[i] = Integer.MAX_VALUE;
        }
        dist[src] = 0;

        //Min heap based on distance
        // PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.dist - b.dist);
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(0, src));

        while(!pq.isEmpty()){
            Pair curr = pq.poll();
            int node = curr.node;
            int currDist = curr.dist;

            if(currDist > dist[node]) continue;

            for(Pair p : adj.get(node)){
                int totalDist = curr.dist + p.dist;
                if(totalDist < dist[p.node]){
                    dist[p.node] = totalDist;
                    pq.add(new Pair(totalDist, p.node));
                }
            }
            // for(int i=0; i<adj.get(node).size(); i++){
            //     Pair neighbour = adj.get(node).get(i);
            //     int nextnode = neighbour.node;
            //     int weight = neighbour.dist;

            //     //Relaxation
            //     if(dist[node] + weight < dist[nextnode]){
            //         dist[nextnode] = dist[node] + weight;
            //         pq.add(new Pair(dist[nextnode], nextnode));
            //     }
            // }
        }
        return dist;
    }
    public static void main(String[] args) {
        int V = 3;
        int[][] edges = {{0, 1, 1}, {1, 2, 3}, {0, 2, 6}};
        int src = 2;
        int[] ans = dijkstra(V, edges, src);
        System.out.println(Arrays.toString(ans));
    }
}
