package Greedy;

import java.util.Arrays;

public class Min_arrows_to_burst_balloons {

    public static int findMinArrowShots(int[][] points) {
        int ans = 0;
        int n = points.length;

        //Sort points on the basis of end time...
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));

        int lastEndIndex = points[0][1];

        for(int i=1; i<n; i++){
            if(points[i][0] <= lastEndIndex){
                ans++;
            }
            else{
                lastEndIndex = points[i][1];
            }
        }
        return n - ans;
    }

    public static void main(String[] args) {
        int[][] points = {{10,16},{2,8},{1,6},{7,12}};
        int ans = findMinArrowShots(points);
        System.out.println(ans);
    }
}
