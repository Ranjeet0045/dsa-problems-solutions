
import java.util.ArrayList;
import java.util.Arrays;

// Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.
// Example- Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
// Output: [[1,6],[8,10],[15,18]]
// Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].

public class Merge_Intervals {

    static int[][] merge(int Intervals[][]){
        Arrays.sort(Intervals, (a, b) -> Integer.compare(a[0], b[0]));
        ArrayList<int[]> list = new ArrayList<>();
        for (int[] interval : Intervals){
            if (list.isEmpty()){
                list.add(interval);
            }
            else{
                int preInterval[] = list.get(list.size() - 1);
                if (interval[0] <= preInterval[1]){ // Fixed the condition to correctly merge intervals
                    preInterval[1] = Math.max(preInterval[1], interval[1]);
                }
                else{
                    list.add(interval);
                }
            }
        }
        return list.toArray(int[][]::new);
    }

    public static void main(String[] args) {
        int[][] interval = {{1,3},{2,6},{8,10},{15,18}};
        int[][] merged = merge(interval);
        for (int[] intervalitem : merged) {
            System.out.print(Arrays.toString(intervalitem)); 
        }
        
    }
}
