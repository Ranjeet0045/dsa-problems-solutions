package Graph.Hamiltonian_cycle;

import java.util.ArrayList;
import java.util.Arrays;

public class Hamiltonian_path_exist {

    static boolean check(int n, int m, ArrayList<ArrayList<Integer>> edges) {

        // Step 1: Build adjacency list
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int a = edges.get(i).get(0);
            int b = edges.get(i).get(1);

            adj.get(a).add(b);
            adj.get(b).add(a);
        }

        // Step 2: Try DFS from every node
        for (int i = 1; i <= n; i++) {
            boolean[] vis = new boolean[n + 1];
            if (dfs(i, vis, 1, n, adj)) {
                return true;
            }
        }

        return false;
    }

    private static boolean dfs(int node, boolean[] vis, int count,
    int n, ArrayList<ArrayList<Integer>> adj) {

        vis[node] = true;

        if (count == n) {
            return true;
        }

        for (int i = 0; i < adj.get(node).size(); i++) {
            int next = adj.get(node).get(i);

            if (!vis[next]) {
                if (dfs(next, vis, count + 1, n, adj)) {
                    return true;
                }
            }
        }

        // Backtrack
        vis[node] = false;
        return false;
    }

    public static void main(String[] args) {
        int n = 4, m = 4;

        ArrayList<ArrayList<Integer>> edges = new ArrayList<>(Arrays.asList(
                new ArrayList<>(Arrays.asList(1, 2)),
                new ArrayList<>(Arrays.asList(2, 3)),
                new ArrayList<>(Arrays.asList(3, 4)),
                new ArrayList<>(Arrays.asList(2, 4))
        ));

        boolean ans = check(n, m, edges);
        System.out.println(ans);
    }
}
