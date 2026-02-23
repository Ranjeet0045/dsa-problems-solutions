package Graph.Dijkstra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
// import java.util.PriorityQueue;
import java.util.Queue;

public class Cheapest_flights_with_k_stops {

    static class Pair{
        int node;
        int cost;
        public Pair(int node, int cost){
            this.node = node;
            this.cost = cost;
        }
    }

    // static class Triplet implements Comparable<Triplet>{
    static class Triplet{
        int node;
        int cost;
        int stops;
        public Triplet(int node, int cost, int stops){
            this.node = node;
            this.cost = cost;
            this.stops = stops;
        }
        // public int compareTo(Triplet t){
        //     if(this.stops == t.stops) return this.cost - t.cost;
        //     return this.stops - t.stops;
        // }
    }

    //Can be solved by both priority queue and normal queue because here order of queue automaticaly maintained that is LIFO

    public static int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        List<List<Pair>> adj = new ArrayList<>();
        for(int i=0; i<n; i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0; i<flights.length; i++){
            int from = flights[i][0], to = flights[i][1], price = flights[i][2];
            adj.get(from).add(new Pair(to, price));
        }
        int[] ans = new int[n];
        Arrays.fill(ans, Integer.MAX_VALUE);
        ans[src] = 0;
        // PriorityQueue<Triplet> pq = new PriorityQueue<>();
        Queue<Triplet> pq = new LinkedList<>();
        pq.add(new Triplet(src, 0, 0));

        while(!pq.isEmpty()){
            Triplet top = pq.poll();
            int node = top.node, cost = top.cost, stops = top.stops;
            if(stops == k+1) continue;

            for(Pair p : adj.get(node)){
                int totalCost = cost + p.cost;
                if(totalCost < ans[p.node]){
                    ans[p.node] = totalCost;
                    pq.add(new Triplet(p.node, totalCost, stops+1));
                }
            }
        }
        if(ans[dst] == Integer.MAX_VALUE) return -1;
        return ans[dst];
    }
    public static void main(String[] args) {
        int n = 4;
        int[][] flights = {{0,1,100},{1,2,100},{2,0,100},{1,3,600},{2,3,200}};
        int src = 0, dst = 3, k = 1;
        System.out.println(findCheapestPrice(n, flights, src, dst, k));
    }
}
