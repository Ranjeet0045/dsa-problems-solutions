package Graph.Topological_sort;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Using_bfs {

    public static ArrayList<Integer> topoSort(int V, int[][] edges) {

        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            adj.get(u).add(v);
        }

        //Compute indegree
        int[] indegree = new int[V];
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < adj.get(i).size(); j++) {
                int v = adj.get(i).get(j);
                indegree[v]++;
            }
        }

        //Push all nodes with indegree 0
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < V; i++) {
            if (indegree[i] == 0) {
                queue.add(i);
            }
        }

        //BFS
        ArrayList<Integer> ans = new ArrayList<>();

        while (!queue.isEmpty()) {
            int u = queue.poll();
            ans.add(u);

            for (int j = 0; j < adj.get(u).size(); j++) {
                int v = adj.get(u).get(j);
                indegree[v]--;

                if (indegree[v] == 0) {
                    queue.add(v);
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int V = 4;
        int[][] edges = {{3, 0}, {1, 0}, {2, 0}};
        System.out.println(topoSort(V, edges));
    }
}
