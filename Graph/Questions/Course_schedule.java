package Graph.Questions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Course_schedule {

    private static boolean canFinish(int n, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0; i<n; i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0; i<prerequisites.length; i++){
            int a = prerequisites[i][0], b = prerequisites[i][1];
            adj.get(b).add(a); //since edges are from b->a
        }

        //Calculate indegree of all nodes
        int[] indegree = new int[n];
        for(int i=0; i<n; i++){
            for(int j=0; j<adj.get(i).size(); j++){
                int v = adj.get(i).get(j);
                indegree[v]++;
            }
        }

        //push all nodes with indegree 0 in queue
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<n; i++){
            if(indegree[i] == 0) q.add(i);
        }

        //BFS
        ArrayList<Integer> ans = new ArrayList<>();
        while(q.size() > 0){
            int u = q.poll();
            ans.add(u);
            for(int j=0; j<adj.get(u).size(); j++){
                int v = adj.get(u).get(j);
                indegree[v]--;

                if(indegree[v] == 0){
                    q.add(v);
                }
            }
        }

        return ans.size() == n;
    }
    public static void main(String[] args) {
        int numCourses = 2;
        int[][] prerequisites = {{1,0},{0,1}};
        System.out.println(canFinish(numCourses, prerequisites));
    }
}
