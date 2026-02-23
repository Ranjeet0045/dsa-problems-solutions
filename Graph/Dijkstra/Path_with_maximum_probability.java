package Graph.Dijkstra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
public class Path_with_maximum_probability {

    static class Pair implements Comparable<Pair>{
        int node;
        double prob;
        Pair(int node, double prob){
            this.node = node;
            this.prob = prob;
        }
        public int compareTo(Pair p){
            if(this.prob == p.prob) return this.node - p.node;
            return Double.compare(this.prob, p.prob);
        }
    }
    public static double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {
        List<List<Pair>> adj = new ArrayList<>();
        for(int i=0; i<n; i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0; i<edges.length; i++){
            int a = edges[i][0], b = edges[i][1];
            double prob = succProb[i];
            adj.get(a).add(new Pair(b, prob));
            adj.get(b).add(new Pair(a, prob));
        }
        double[] ans = new double[n];
        ans[start] = 1;

        PriorityQueue<Pair> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(new Pair(start, 1));
        while(pq.size() > 0){
            Pair top = pq.poll();
            if(top.prob < ans[top.node]) continue;
            
            for(Pair p : adj.get(top.node)){
                double totalProb = top.prob * p.prob;
                if(totalProb > ans[p.node]){
                    ans[p.node] = totalProb;
                    pq.add(new Pair(p.node, totalProb));
                }
            }
        }

        return ans[end];
    }
    public static void main(String[] args) {
        int n = 3;
        int[][] edges = {{0,1},{1,2},{0,2}};
        double[] succProb = {0.5,0.5,0.2};
        int start = 0, end = 2;

        double ans = maxProbability(n, edges, succProb, start, end);
        System.out.println(ans);
    }
}
