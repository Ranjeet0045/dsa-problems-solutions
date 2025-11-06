import java.util.Collections;
import java.util.PriorityQueue;

public class Count_min_after_k_removals {

    public static int countMin(String str,int k){

        int[] arr = new int[26];

        for(int i=0; i<str.length(); i++){
            int num = str.charAt(i) - 'a';
            arr[num] += 1;
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0; i<arr.length; i++){
            pq.add(arr[i]);
        }

        while(k > 0){
            int num = pq.poll();
            num = num - 1;
            pq.add(num);
            k--;
        }


        int min =  0;
        while(!pq.isEmpty()){
            int x = pq.poll();
            min += x*x;
        }

        return min;
    }

    public static void main(String[] args) {
        String str = "abccc";
        int k = 1;
        int ans = countMin(str,k);
        System.out.println(ans);
    }
}
