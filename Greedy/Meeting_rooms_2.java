package Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Meeting_rooms_2 {
    
    public static int countMaxRooms(List<List<Integer>> intervals){
        int n = intervals.size();
        int[] arr = new int[n];
        int[] brr = new int[n];
        
        for (int i = 0; i < n; i++) {
            List<Integer> list = new ArrayList<>(intervals.get(i));
            arr[i] = list.get(0);
            brr[i] = list.get(1);
        }
        return helper(arr,brr);
    }
    public static int helper(int[] start,int[] end){
        int count = 0;
        int ans = 0;
        Arrays.sort(start);
        Arrays.sort(end);

        int i = 0, j =0;
        while(i<start.length && j<end.length){
            
            if(start[i] < end[j]){
                count++;
                ans = Math.max(count,ans);
                i++;
            }
            else if(start[i] == end[i]){
                i++;
                j++;
            }
            else{
                j++;
                count--;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        List<List<Integer>> intervals = Arrays.asList(
            Arrays.asList(0, 30),
            Arrays.asList(5, 10),
            Arrays.asList(15, 20)
        );
        int ans = countMaxRooms(intervals);
        System.out.println(ans);
    }
}
