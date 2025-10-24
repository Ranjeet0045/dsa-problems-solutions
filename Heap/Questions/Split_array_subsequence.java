package Heap.Questions;

import java.util.PriorityQueue;

public class Split_array_subsequence {

    public static boolean isPossible(int[] arr, int k) {
        if (k <= 1) return true;
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            if (a[0] != b[0]) return Integer.compare(a[0], b[0]);
            return Integer.compare(a[1], b[1]);
        });

        for (int num : arr) {
            
            while (!pq.isEmpty() && pq.peek()[0] < num - 1) {
                int[] seq = pq.poll();
                if (seq[1] < k) return false;
            }

            if (!pq.isEmpty() && pq.peek()[0] == num - 1) {
                int[] seq = pq.poll();
                pq.offer(new int[] { num, seq[1] + 1 });
            } else {
                
                pq.offer(new int[] { num, 1 });
            }
        }

        while (!pq.isEmpty()) {
            if (pq.poll()[1] < k) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[] = {8, 9, 10, 11, 12, 13, 14};
        int k = 5;
        boolean ans = isPossible(arr,k);
        System.out.println(ans);
    }
}
