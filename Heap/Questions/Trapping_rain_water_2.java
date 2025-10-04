package Heap.Questions;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Trapping_rain_water_2 {

    public static int trapRainWater(int[][] heightMap) {
        int n = heightMap.length;
        int m = heightMap[0].length;

        if (n <= 2 || m <= 2) return 0; // no space to hold water

        boolean[][] visited = new boolean[n][m];

        // Priority queue stores {row, col, height}, sorted by height
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[2]));

        // Step 1: add boundary cells into min-heap
        for (int i = 0; i < n; i++) {
            pq.add(new int[]{i, 0, heightMap[i][0]});
            pq.add(new int[]{i, m - 1, heightMap[i][m - 1]});
            visited[i][0] = visited[i][m - 1] = true;
        }
        for (int j = 1; j < m - 1; j++) {
            pq.add(new int[]{0, j, heightMap[0][j]});
            pq.add(new int[]{n - 1, j, heightMap[n - 1][j]});
            visited[0][j] = visited[n - 1][j] = true;
        }

        // Step 2: BFS + min-heap
        int water = 0;
        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};

        while (!pq.isEmpty()) {
            int[] cell = pq.poll();
            int row = cell[0], col = cell[1], height = cell[2];

            for (int[] d : dirs) {
                int r = row + d[0];
                int c = col + d[1];

                if (r >= 0 && r < n && c >= 0 && c < m && !visited[r][c]) {
                    visited[r][c] = true;

                    // If neighbor is lower, water is trapped
                    water += Math.max(0, height - heightMap[r][c]);

                    // Update neighbor boundary with max of current wall and its height
                    pq.add(new int[]{r, c, Math.max(heightMap[r][c], height)});
                }
            }
        }

        return water;
    }
    public static void main(String[] args) {
        int[][] arr = {{18,2,3},{4,5,6},{7,8,9}};
        // {{12,13,1,12},{13,4,13,12},{13,8,10,12},{12,13,12,12},{13,13,13,13}};
        int ans = trapRainWater(arr);
        System.out.println(ans);
    }
}
