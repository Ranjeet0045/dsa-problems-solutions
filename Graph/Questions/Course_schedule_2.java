package Graph.Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Course_schedule_2 {

    public static int[] findOrder(int n, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0; i<n; i++){
            adj.add(new ArrayList<>());
        }
        int[] indegree = new int[n];
        for(int i=0; i<prerequisites.length; i++){
            int a = prerequisites[i][0], b = prerequisites[i][1];
            adj.get(b).add(a);
            indegree[a]++;
        }

        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<n; i++){
            if(indegree[i] == 0) q.add(i);
        }

        List<Integer> ans = new ArrayList<>();
        while(q.size() > 0){
            int u = q.poll();
            ans.add(u);

            for(int j=0; j<adj.get(u).size(); j++){
                int v = adj.get(u).get(j);
                indegree[v]--;
                if(indegree[v] == 0) q.add(v);
            }
        }
        int[] result = new int[ans.size()];
        for(int i=0; i<ans.size(); i++){
            result[i] = ans.get(i);
        }

        if(ans.size() != n) return new int[0];
        return result;
    }
    public static void main(String[] args) {
        int numCourses = 4;
        int[][] prerequisites = {{1,0},{2,0},{3,1},{3,2}};
        System.out.println(Arrays.toString(findOrder(numCourses, prerequisites)));
    }
}
