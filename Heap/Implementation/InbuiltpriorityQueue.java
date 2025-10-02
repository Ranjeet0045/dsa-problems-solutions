package Heap.Implementation;

import java.util.Collections;
import java.util.PriorityQueue;

public class InbuiltpriorityQueue {
    public static void main(String[] args) {
        // Min Priority Queue (default)
        PriorityQueue<Integer> minPQ = new PriorityQueue<>();
        minPQ.add(10);
        minPQ.add(5);
        minPQ.add(20);

        System.out.println("MinPQ Peek: " + minPQ.peek()); // 5
        System.out.println("MinPQ Poll: " + minPQ.poll()); // 5
        System.out.println("MinPQ After Poll: " + minPQ);

        // Max Priority Queue
        PriorityQueue<Integer> maxPQ = new PriorityQueue<>(Collections.reverseOrder());
        maxPQ.add(10);
        maxPQ.add(5);
        maxPQ.add(20);

        System.out.println("MaxPQ Peek: " + maxPQ.peek()); // 20
        System.out.println("MaxPQ Poll: " + maxPQ.poll()); // 20
        System.out.println("MaxPQ After Poll: " + maxPQ);
    }
}
