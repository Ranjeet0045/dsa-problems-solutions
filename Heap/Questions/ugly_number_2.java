package Heap.Questions;

import java.util.HashSet;
import java.util.PriorityQueue;

public class ugly_number_2 {

    //BruteForce: This approach will give TLE for larger input...

    // public static boolean isUgly(int n) {
    //     if (n <= 0) return false;
    //     int[] factors = {2, 3, 5};
        
    //     for (int f : factors) {
    //         while (n % f == 0) {
    //             n /= f;
    //         }
    //     }
    //     return n == 1;
    // }

    // public static int nthUglyNumber(int n) {
    //     int count = 0;
    //     int i = 1;

    //     while(count < n){
    //         if(isUgly(i)){
    //             count++;
    //         }
    //         i++;
    //     }
    //     return i-1;
    // }

    //Optimised : Using priority Queue


    public static int nthUglyNumber(int n){
        PriorityQueue<Long> pq = new PriorityQueue<>();
        HashSet<Long> set = new HashSet<>();

        pq.add(1L);
        set.add(1L);

        long ugly = 1;
        for(int i=0; i<n; i++){
            ugly = pq.poll();
            
            long next2 = ugly*2;
            long next3 = ugly*3;
            long next5 = ugly*5;

            if(set.add(next2)) pq.add(next2);//Set.add() return true if number is not already present in
            if(set.add(next3)) pq.add(next3);//set otherwise returns false...
            if(set.add(next5)) pq.add(next5); 
        }

        return (int)ugly;
    }

    public static void main(String[] args) {
        int n = 10;
        int ans = nthUglyNumber(n);
        System.out.println(ans);
    }
}
