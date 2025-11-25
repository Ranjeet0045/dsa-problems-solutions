package Graph.Questions;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Keys_and_rooms {

    public static boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean[] vis = new boolean[n];
        vis[0] = true;
        bfs(0,vis,rooms);
        
        for(boolean ele : vis){
            if(!ele) return false;
        }
        return true;
    }

    private static void bfs(int start, boolean[] vis, List<List<Integer>> rooms) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        while(!q.isEmpty()){
            int front = q.remove();
            for(int ele : rooms.get(front)){
                if(!vis[ele]){
                    q.add(ele);
                    vis[ele] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> rooms = Arrays.asList(
            Arrays.asList(1, 3),
            Arrays.asList(3, 0, 1),
            Arrays.asList(2),
            Arrays.asList(0)
        );

        boolean ans = canVisitAllRooms(rooms);
        System.out.println(ans);
    }
}
