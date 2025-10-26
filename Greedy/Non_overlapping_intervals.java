package Greedy;

import java.util.Arrays;

public class Non_overlapping_intervals {

    public static int eraseOverlapIntervals(int[][] intervals) {
        int ans = 0;

        //Sort intervals on the basis of end time...
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));

        int lastEndIndex = intervals[0][1];

        //If start time of current interval is less than end time of previous interval then that should be removed else update lastEndIndex as current interval end time...
        for(int i=1; i<intervals.length; i++){
            if(intervals[i][0] < lastEndIndex){
                ans++;
            }
            else{
                lastEndIndex = intervals[i][1];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] intervals = {{1,2},{2,3},{3,4},{1,3}};
        int ans = eraseOverlapIntervals(intervals);
        System.out.println(ans);
    }
}
