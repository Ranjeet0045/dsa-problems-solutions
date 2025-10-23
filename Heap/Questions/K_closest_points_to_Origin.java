package Heap.Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

public class K_closest_points_to_Origin {

    public static ArrayList<ArrayList<Integer>> kClosest(int[][] points, int k) {

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        PriorityQueue<Double> pq = new PriorityQueue<>();
        HashMap<Double,ArrayList<Integer>> map = new HashMap<>();
        int m = points.length;
        
        for(int i=0; i<m; i++){
            double dist = (Math.sqrt((points[i][0]*points[i][0]) + (points[i][1]*points[i][1])));
            pq.add(dist);
            map.put(dist,new ArrayList<>(Arrays.asList(points[i][0],points[i][1])));
        }

        int i = 0;
        while(i < k){
            double temp = pq.poll();
            ans.add(map.get(temp));
            i++;
        }
        return ans;
    }
    public static void main(String[] args) {
        int k = 2;
        int[][] points = {{1, 3}, {-2, 2}, {5, 8}, {0, 1}};
        ArrayList<ArrayList<Integer>> ans = kClosest(points,k);
        System.out.println(ans);
    }
}
