package Heap.Questions;

import java.util.*;

public class k_smallest_sum_pairs {

    public static ArrayList<ArrayList<Integer>> kSmallestPair(int[] arr1, int[] arr2, int k) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        // Min-heap sorted by sum (a[2] = arr1[i] + arr2[j])
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[2] - b[2]);
        HashSet<String> visited = new HashSet<>();

        // start with (0, 0)
        pq.offer(new int[]{0, 0, arr1[0] + arr2[0]});
        visited.add("0,0");

        while (!pq.isEmpty() && ans.size() < k) {
            int[] curr = pq.poll();
            int i = curr[0];
            int j = curr[1];

            ArrayList<Integer> list = new ArrayList<>();
            list.add(arr1[i]);
            list.add(arr2[j]);
            ans.add(list);

            // push (i+1, j)
            if (i + 1 < arr1.length && !visited.contains((i + 1) + "," + j)) {
                pq.offer(new int[]{i + 1, j, arr1[i + 1] + arr2[j]});
                visited.add((i + 1) + "," + j);
            }

            // push (i, j+1)
            if (j + 1 < arr2.length && !visited.contains(i + "," + (j + 1))) {
                pq.offer(new int[]{i, j + 1, arr1[i] + arr2[j + 1]});
                visited.add(i + "," + (j + 1));
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr1[] = {6, 6, 9, 10, 10, 11, 12};
        int arr2[] = {4, 5, 5, 6, 10, 11, 13};
        int k = 10;

        ArrayList<ArrayList<Integer>> list = kSmallestPair(arr1, arr2, k);
        System.out.println(list);
    }
}
