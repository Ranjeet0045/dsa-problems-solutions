import java.util.*;
import java.util.List;


public class Find_if_path_exist_in_graph {

    public static boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0; i<n; i++){
            List<Integer> list = new ArrayList<>();
            adj.add(list);
        }
        for(int i=0; i<edges.length; i++){
            int a = edges[i][0];
            int b = edges[i][1];

            adj.get(a).add(b);
            adj.get(b).add(a);
        }
        boolean[] vis = new boolean[n];
        vis[source] = true;
        bfs(source, vis, adj, destination);

        return vis[destination];
    }

    private static void bfs(int source, boolean[] vis, List<List<Integer>> adj, int destination) {
        int n = adj.size();

        Queue<Integer> q = new LinkedList<>();
        q.add(source);
        while(q.size() > 0){
            int front = q.remove();

            // for(int ele : adj.get(front)){
            //     vis[ele] = true;
            //     q.add(ele);

            //     if(ele == destination) return;
            // }
            for(int i=0; i<adj.get(front).size(); i++){
                int node = adj.get(front).get(i);
                
                if(!vis[node]) {
                    vis[node] = true;
                    q.add(node);
                }
                if(adj.get(front).get(i) == destination) return;
            }
        }
    }

    public static void main(String[] args) {
        int n = 3;
        int[][] edges = {{0,1},{1,2},{2,0}};
        int source = 0;
        int destination = 2;

        System.out.println(validPath(n, edges, source, destination));
    }
}
