package Greedy;

import java.util.Arrays;

public class Maximum_event_attended {

    static int maxEvents(int[][] events) {
        Arrays.sort(events, (a, b) -> a[1] - b[1]); // Sort by end day

        int maxDay = 0;
        for (int[] event : events) {
            maxDay = Math.max(maxDay, event[1]);
        }

        // DSU(Disjoint Set Union) array to track next available day
        int[] parent = new int[maxDay + 2]; // +2 to handle edge case at maxDay+1
        for (int i = 0; i <= maxDay + 1; i++) {
            parent[i] = i;
        }

        int count = 0;

        for (int[] event : events) {
            int availableDay = find(parent, event[0]);

            if (availableDay <= event[1]) {
                count++;
                // Mark this day as used: point to next free day
                parent[availableDay] = find(parent, availableDay + 1);
            }
        }

        return count;
    }

    // Find with path compression
    static int find(int[] parent, int day) {
        if (parent[day] != day) {
            parent[day] = find(parent, parent[day]);
        }
        return parent[day];
    }

    public static void main(String[] args) {
        int[][] events = {{1,10},{2,2},{2,2},{2,2},{2,2}};
        int ans = maxEvents(events);
        System.out.println(ans);
    }
}
