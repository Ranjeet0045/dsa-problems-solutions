package Greedy;

import java.util.*;

public class Merge_intervals {

    public static int[][] merge(int[][] intervals) {

        //Sort on the basis of start Index
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();
        int startIndex = intervals[0][0];
        int endIndex = intervals[0][1];

        for(int i=1; i<intervals.length; i++){
            if(intervals[i][0] <= endIndex){
                endIndex = Math.max(endIndex, intervals[i][1]);
            }
            else{
                merged.add(new int[]{startIndex, endIndex});
                startIndex = intervals[i][0];
                endIndex = intervals[i][1];
            }
        }

        merged.add(new int[]{startIndex, endIndex});
        
        return merged.toArray(new int[merged.size()][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int[][] result = merge(intervals);

        for (int i = 0; i < result.length; i++) {
            System.out.print(Arrays.toString(result[i]) + " ");
        }
    }
}
