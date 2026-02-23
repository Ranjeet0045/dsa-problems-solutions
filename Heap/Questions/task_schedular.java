package Heap.Questions;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class task_schedular {

    //Using priority queue
    private static int leastInterval(char[] tasks, int n){
        int[] frequencies = new int[26];
        for (char task : tasks) {
            frequencies[task - 'A']++;
        }
        
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);//Max Heap
        for (int freq : frequencies) {
            if (freq > 0) {
                pq.offer(freq);
            }
        }
        
        int intervals = 0;
        while (!pq.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i <= n; i++) {
                if (!pq.isEmpty()) {
                    int freq = pq.poll();
                    if (freq - 1 > 0) {
                        temp.add(freq - 1);
                    }
                }
                intervals++;
                if (pq.isEmpty() && temp.isEmpty()) {
                    break;
                }
            }
            pq.addAll(temp);
        }
        
        return intervals;
    }


    //Greedy approach
    private int leastInterval2(char[] tasks, int n) {
        if(n == 0) return tasks.length;

        int[] freq = new int[26];
        for(int i=0; i<tasks.length; i++){
            char ch = tasks[i];
            int idx = ch - 'A';
            freq[idx] += 1;
        }
        int maxFreq = 0;
        for(int num : freq){
            maxFreq = Math.max(num, maxFreq);
        }

        int maxCount = 0;
        for(int num : freq){
            if(num == maxFreq){
                maxCount++;
            }
        }
        int min = (maxFreq-1)*(n+1) + maxCount;

        return Math.max(min, tasks.length);
    }

    public static void main(String[] args) {
        char[] tasks = {'A','A','A','B','B','B'};
        int n = 2;
        System.out.println(leastInterval(tasks, n));
    }
}
