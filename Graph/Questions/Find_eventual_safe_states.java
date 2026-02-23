package Graph.Questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Find_eventual_safe_states{

    public static List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0; i<n; i++){
            adj.add(new ArrayList<>());
        }
        int[] indegree = new int[n];
        
        //Reversing graph
        for(int i=0; i<n; i++){
            for(int ele : graph[i]){
                //in original graph, edge is from i -> ele
                //in reverse graph, edge is from ele -> i
                adj.get(ele).add(i);
                indegree[i]++;
            }
        }

        //Apply kahn's algorithm
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<n; i++){
            if(indegree[i] == 0) q.add(i);
        }

        List<Integer> ans = new ArrayList<>();
        while(q.size() > 0){
            int u = q.poll();
            ans.add(u);

            for(int i=0; i<adj.get(u).size(); i++){
                int v = adj.get(u).get(i);
                indegree[v]--;

                if(indegree[v] == 0) q.add(v);
            }
        }
        Collections.sort(ans);
        return ans;
    }
    public static void main(String[] args) {
        int[][] graph = {{1,2},{2,3},{5},{0},{5},{},{}};
        System.out.println(eventualSafeNodes(graph));
    }
}