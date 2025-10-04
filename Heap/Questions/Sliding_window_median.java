package Heap.Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sliding_window_median {

    // This will give TLE

    // public static double[] medianSlidingWindow(int[] nums, int k) {
    //     int n = nums.length;
    //     double[] ans = new double[n-k+1];
    //     PriorityQueue<Integer> pq = new PriorityQueue<>();

    //     int l = 0;
    //     for (int i = 0; i <= n-k; i++) {
    //         int j = i;
    //         while(j < k+i ){
    //             pq.add(nums[j]);
    //             j++;
    //         }

    //         if(pq.size() % 2 != 0){
    //             int x = pq.size()/2;
    //             while(x > 0){
    //                 pq.poll();
    //                 x--;
    //             }

    //             ans[l] = pq.peek();
    //             l++;
    //             pq.clear();
    //         }
    //         else{
    //             int x = pq.size()/2;
    //             while(x > 1){
    //                 pq.poll();
    //                 x--;
    //             }
    //             double t1 = pq.poll();
    //             double t2 = pq.poll();
    //             double f = (t1+t2)/2;
    //             ans[l] = f;
    //             l++;
    //             pq.clear();
    //         }
    //     }

    //     return ans;
    // }

    // Using two heaps but little trickier to implement: This is the most optimised version

    //  public static double[] medianSlidingWindow(int[] nums, int k) {
    //     int n = nums.length;
    //     double[] ans = new double[n - k + 1];

    //     PriorityQueue<Integer> left = new PriorityQueue<>(Collections.reverseOrder());
    //     PriorityQueue<Integer> right = new PriorityQueue<>();

    //     for (int i = 0; i < n; i++) {

    //         if (left.isEmpty() || nums[i] <= left.peek()) {
    //             left.add(nums[i]);
    //         } else {
    //             right.add(nums[i]);
    //         }

    //         balance(left, right);

    //         if (i >= k) {
    //             int out = nums[i - k];
    //             if (out <= left.peek()) {
    //                 left.remove(out);  // O(k), but amortized still fast enough
    //             } else {
    //                 right.remove(out);
    //             }
    //             balance(left, right);
    //         }

    //         if (i >= k - 1) {
    //             if (left.size() == right.size()) {
    //                 ans[i - k + 1] = ((long) left.peek() + (long) right.peek()) / 2.0;
    //             } else {
    //                 ans[i - k + 1] = left.peek();
    //             }
    //         }
    //     }

    //     return ans;
    // }

    // private static void balance(PriorityQueue<Integer> left, PriorityQueue<Integer> right) {
    //     // Ensure left has equal or one more element
    //     if (left.size() > right.size() + 1) {
    //         right.add(left.poll());
    //     } else if (right.size() > left.size()) {
    //         left.add(right.poll());
    //     }
    // }


    //Using binary search which keeps array always sorted

    //  public static double[] medianSlidingWindow(int[] nums, int k) {
    //     int n = nums.length;
    //     double[] ans = new double[n - k + 1];
    //     List<Integer> window = new ArrayList<>();

    //     // Initialize the first window
    //     for (int i = 0; i < k; i++) {
    //         insert(window, nums[i]);
    //     }
    //     ans[0] = getMedian(window, k);

    //     // Slide the window
    //     for (int i = k; i < n; i++) {
    //         remove(window, nums[i - k]);
    //         insert(window, nums[i]);
    //         ans[i - k + 1] = getMedian(window, k);
    //     }

    //     return ans;
    // }

    // private static void insert(List<Integer> window, int num) {
    //     int pos = Collections.binarySearch(window, num);
    //     if (pos < 0) pos = -pos - 1;
    //     window.add(pos, num);
    // }

    // private static void remove(List<Integer> window, int num) {
    //     int pos = Collections.binarySearch(window, num);
    //     window.remove(pos);
    // }

    // private static double getMedian(List<Integer> window, int k) {
    //     if (k % 2 == 1) {
    //         return window.get(k / 2);
    //     } else {
    //         return (window.get(k / 2 - 1) + window.get(k / 2)) / 2.0;
    //     }
    // }

    //Using core sliding window concept: Also give TLE for larger input

    public static double[] medianSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        double[] ans = new double[n - k + 1];
        List<Integer> window = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            // Add new element
            window.add(nums[i]);

            // Remove element outside window
            if (window.size() > k) {
                window.remove(0);
            }

            // Compute median if window is full
            if (window.size() == k) {
                List<Integer> sortedWindow = new ArrayList<>(window);
                Collections.sort(sortedWindow);

                if (k % 2 == 0) {
                    int mid = k / 2;
                    ans[i - k + 1] = (sortedWindow.get(mid - 1) + sortedWindow.get(mid)) / 2.0;
                } else {
                    ans[i - k + 1] = sortedWindow.get(k / 2);
                }
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        double[] ans = medianSlidingWindow(nums,k);
        System.out.println(Arrays.toString(ans));
    }
}
