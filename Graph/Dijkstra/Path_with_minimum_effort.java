package Graph.Dijkstra;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Path_with_minimum_effort {

    static class Triplet implements Comparable<Triplet>{
        int row;
        int col;
        int effort;

        public Triplet(int row, int col, int effort){
            this.row = row;
            this.col = col;
            this.effort = effort;
        }

        public int compareTo(Triplet t){
            if(this.effort == t.effort) return this.row - t.row;
            return this.effort - t.effort;
        }
    }

    public static int minimumEffortPath(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        int[][] ans = new int[m][n];
        for(int i=0; i<m; i++){
            Arrays.fill(ans[i], Integer.MAX_VALUE);
        }
        ans[0][0] = 0;

        PriorityQueue<Triplet> pq = new PriorityQueue<>();
        pq.add(new Triplet(0, 0, 0));

        int[] r = {-1, 0, 1, 0};
        int[] c = {0, -1, 0, 1};

        while (!pq.isEmpty()) {
            Triplet top = pq.poll();
            int row = top.row, col = top.col, effort = top.effort;
            if(row == m-1 && col == n-1) break;

        //     //going up
        //     if(row > 0){
        //         int e = Math.abs(arr[row][col] - arr[row-1][col]);
        //         e = Math.max(e, effort);
        //         if(e < ans[row-1][col]){
        //             ans[row-1][col] = e;
        //             pq.add(new Triplet(row-1, col, e));
        //         }
        //     }

        //     //going left
        //     if(col > 0){
        //         int e = Math.abs(arr[row][col] - arr[row][col-1]);
        //         e = Math.max(e, effort);
        //         if(e < ans[row][col-1]){
        //             ans[row][col-1] = e;
        //             pq.add(new Triplet(row, col-1, e));
        //         }
        //     }

        //     //going down
        //     if(row < m-1){
        //         int e = Math.abs(arr[row][col] - arr[row+1][col]);
        //         e = Math.max(e, effort);
        //         if(e < ans[row+1][col]){
        //             ans[row+1][col] = e;
        //             pq.add(new Triplet(row+1, col, e));
        //         }
        //     }

        //     //going right
        //     if(col < n-1){
        //         int e = Math.abs(arr[row][col] - arr[row][col+1]);
        //         e = Math.max(e, effort);
        //         if(e < ans[row][col+1]){
        //             ans[row][col+1] = e;
        //             pq.add(new Triplet(row, col+1, e));
        //         }
        //     }


            //Alternative and shorter method for above 4 conditions

            for(int i=0; i<=3; i++){
                int newRow = row + r[i];
                int newCol = col + c[i];

                if(newRow<0 || newCol<0 || newRow>m-1 || newCol>n-1) continue;

                int e = Math.abs(arr[row][col] - arr[newRow][newCol]);
                e = Math.max(e, effort);
                if(e < ans[newRow][newCol]){
                    ans[newRow][newCol] = e;
                    pq.add(new Triplet(newRow, newCol, e));
                }
            }
        }



        return ans[m-1][n-1];
    }
    public static void main(String[] args) {
        int[][] heights = {{1,2,2},{3,8,2},{5,3,5}};
        System.out.println(minimumEffortPath(heights));
    }
}
