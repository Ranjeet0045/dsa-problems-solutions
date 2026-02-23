package Graph.Questions;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Redundant_connection {

    public static int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;
        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < n; i++) {
            int a = edges[i][0];
            int b = edges[i][1];
            boolean[] vis = new boolean[n + 1];

            if (dfs(a, b, vis, adj)) {
                return edges[i];
            }
            adj.get(a).add(b);
            adj.get(b).add(a);
        }

        return new int[0];//This line will never execute, as it guarrented that an answer exist
    }
    private static boolean dfs(int curr, int target, boolean[] vis, List<List<Integer>> adj) {
        if (curr == target) return true;
        vis[curr] = true;

        for (int i = 0; i < adj.get(curr).size(); i++) {
            int neigh = adj.get(curr).get(i);
            
            if (!vis[neigh]) {
                if (dfs(neigh, target, vis, adj)) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] edges = {{1,2},{1,3},{2,3}};
        int[] ans = findRedundantConnection(edges);
        System.out.println(Arrays.toString(ans));
    }
}
