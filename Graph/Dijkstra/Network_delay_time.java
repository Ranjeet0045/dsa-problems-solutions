package Graph.Dijkstra;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Network_delay_time {

    static class Pair{
        int node;
        int dist;
        public Pair(int node, int dist){
            this.node = node;
            this.dist = dist;
        }
    }
    public static int networkDelayTime(int[][] times, int n, int k) {
        List<List<Pair>> adj = new ArrayList<>();
        for(int i=0; i<n; i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0; i<times.length; i++){
            int a = times[i][0]-1, b = times[i][1]-1, c = times[i][2];//-1 because gives nodes are 1 based
            adj.get(a).add(new Pair(b, c));
        }
        int[] dist = new int[n];
        for(int i=0; i<n; i++){
            dist[i] = Integer.MAX_VALUE;
        }
        dist[k-1] = 0;
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.dist - b.dist);
        pq.add(new Pair(k-1, 0));

        while(!pq.isEmpty()){
            Pair curr = pq.poll();
            int node = curr.node;
            int currDist = curr.dist;
            if(currDist > dist[node]) continue;

            for(Pair p : adj.get(node)){
                int totalDist = curr.dist + p.dist;
                if(totalDist < dist[p.node]){
                    dist[p.node] = totalDist;
                    pq.add(new Pair(p.node, totalDist));
                }
            }
        }
        int max = 0;
        for(int num : dist){
            if(num == Integer.MAX_VALUE) return -1;
            max = Math.max(max, num);
        }
        return max;
    }
    public static void main(String[] args) {
        int[][] times = {{2,1,1},{2,3,1},{3,4,1}};
        int n = 4, k = 2;
        System.out.println(networkDelayTime(times, n, k));
    }
}
