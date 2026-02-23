package Graph.Minimum_spanning_tree;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Main {

    static class Pair implements Comparable<Pair>{
        int node;
        int weight;

        public Pair(int node, int weight){
            this.node = node;
            this.weight = weight;
        }

        public int compareTo(Pair p){
            return this.weight - p.weight;
        }
    }

    public static int spanningTree(int V, int[][] edges) {
        List<List<Pair>> adj = new ArrayList<>();
        for(int i=0; i<V; i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0; i<edges.length; i++){
            int a = edges[i][0], b = edges[i][1], c = edges[i][2];
            adj.get(a).add(new Pair(b, c));
            adj.get(b).add(new Pair(a, c));
        }
        int sum = 0;
        boolean[] vis = new boolean[V];
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        pq.add(new Pair(0, 0));
        while(!pq.isEmpty()){
            Pair top = pq.poll();
            int node = top.node;
            int weight = top.weight;

            if(vis[node]) continue;
            vis[node] = true;
            sum += weight;

            List<Pair> list = adj.get(node);
            for(int i=0; i<list.size(); i++){
                Pair neigh = list.get(i);

                if(!vis[neigh.node]){
                    pq.add(new Pair(neigh.node, neigh.weight));
                }
            }
        }

        return sum;
    }
    public static void main(String[] args) {
        int V = 3, E = 3;
        int[][] Edges = {{0, 1, 5}, {1, 2, 3}, {0, 2, 1}};

        System.out.print("Minimum edge weight is: " );
        System.out.println(spanningTree(V, Edges));

        List<Triplet> list = printSpanningTree(V, Edges);
        for(Triplet t : list){
            System.out.println(t.parent + " - " + t.node + " : " + t.weight);
        }

    }

    static class Triplet{
        int node;
        int parent;
        int weight;

        public Triplet(int node, int parent, int weight){
            this.node = node;
            this.parent = parent;
            this.weight = weight;
        }
    }

    private static List<Triplet> printSpanningTree(int v, int[][] edges) {
        List<List<Pair>> adj = new ArrayList<>();
        for(int i=0; i<v; i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0; i<edges.length; i++){
            int a = edges[i][0], b = edges[i][1], c = edges[i][2];
            adj.get(a).add(new Pair(b, c));
            adj.get(b).add(new Pair(a, c));
        }

        List<Triplet> ans = new ArrayList<>();
        boolean[] vis = new boolean[v];

        PriorityQueue<Triplet> pq = new PriorityQueue<>((a, b)-> a.weight - b.weight);
        pq.add(new Triplet(0, 0,0));

        while(pq.size() > 0){
            Triplet top = pq.poll();
            int node = top.node, weight = top.weight, parent = top.parent;

            if(vis[node] == true) continue;
            vis[node] = true;
            
            if(node != parent){
                ans.add(new Triplet(node, parent, weight));
            }

            List<Pair> list = adj.get(node);
            for(int i=0; i<list.size(); i++){
                Pair neigh = list.get(i);

                if(!vis[neigh.node]){
                    pq.add(new Triplet(neigh.node, node, neigh.weight));
                }
            }
        }

        return ans;
    }
}
