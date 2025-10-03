package Heap.Questions;

import java.util.Collections;
import java.util.PriorityQueue;

public class Construct_target_Array {

    public static boolean isPossible(int[] target) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int n = target.length;
        long sum = 0;

        for(int i=0; i<n; i++){
            pq.add(target[i]);
            sum += target[i];
        }
        while (pq.peek() > 1){
            int largest = pq.poll();
            long restSum = sum - largest;

            if(restSum == 1) return true;
            if(restSum == 0 || largest <= restSum) return false;

            long prev = largest % restSum;
            if(prev == 0) return false;

            pq.add((int)prev);
            sum = restSum + prev;
        }

        return true;
    }
    public static void main(String[] args) {

        int[] target = {9,3,5};
        System.out.println(isPossible(target));
    }
}
