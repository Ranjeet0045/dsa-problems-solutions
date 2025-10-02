package Heap.Questions;

import java.util.PriorityQueue;

public class kthLargestElement {
    static int helper(int[] arr,int k){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(int num : arr){
            minHeap.add(num);
            if(minHeap.size() > k){
                minHeap.poll();//remove smallest
            }
        }

        return minHeap.peek();
    }
    public static void main(String[] args) {
        int[] arr = {3,2,1,5,6,4};
        int k = 2;
        int ans = helper(arr,k);
        System.out.println(ans);
    }
}
