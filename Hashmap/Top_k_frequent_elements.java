package Hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Top_k_frequent_elements {

    public static ArrayList<Integer> topKFreq(int[] arr, int k) {

       ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        
        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap =
            new PriorityQueue<>((a, b) -> {
                if (!a.getValue().equals(b.getValue())) {
                    return b.getValue() - a.getValue();
                } else {
                    return b.getKey() - a.getKey();
                }
            });
        maxHeap.addAll(map.entrySet());

        for(int i=0; i<k && !maxHeap.isEmpty(); i++){
            list.add(maxHeap.poll().getKey());
        }
        
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {3,1,4,4,5,2,6,1};
        int k = 2;
        ArrayList<Integer> ans = topKFreq(arr,k);
        System.out.println(ans);
    }
}
