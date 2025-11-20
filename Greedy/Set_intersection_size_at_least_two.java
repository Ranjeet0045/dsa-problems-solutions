package Greedy;

import java.util.*;

public class Set_intersection_size_at_least_two {

    public static int intersectionSizeTwo(int[][] intervals) {
        Set<Integer> set = new HashSet<>();

        Arrays.sort(intervals, (a,b) -> {
            if(a[1]!=b[1]) return Integer.compare(a[1], b[1]);
            return Integer.compare(b[0], a[0]);
        });

        for (int[] data : intervals) {
            int start = data[0];
            int end = data[1];
            int count = 0;

            for(int x : set){
                if(x >= start && x <= end){
                    count++;
                }
            }

            if(count >= 2) continue;

            for(int i=end; i>=start && count < 2; i--){
                if(!set.contains(i)){
                    set.add(i);
                    count++;
                }
            }
        }

        return set.size();
    }

    public static void main(String[] args) {
        int[][] intervals = {{1,3},{1,4},{2,5},{3,5}};
        int ans = intersectionSizeTwo(intervals);
        System.out.println(ans);
    }
}
