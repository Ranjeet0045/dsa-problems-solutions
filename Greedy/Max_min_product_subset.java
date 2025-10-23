package Greedy;
import java.util.ArrayList;
import java.util.List;

public class Max_min_product_subset {

    public static List<Long> maxMinProduct(int[] arr) {
        List<Long> list = new ArrayList<>();
        long PdtPos = 1;
        long PdtNeg = 1;
        int n = arr.length;
        long countNeg = 0;
        long countPos = 0;
        long countZero = 0;
        long largestNeg = Integer.MIN_VALUE;
        long smallestNeg = Integer.MAX_VALUE;


        for(int i=0; i<n; i++){
            if(arr[i] < 0){
                countNeg += 1;
                PdtNeg *= arr[i];
                if(arr[i] > largestNeg){
                    largestNeg = arr[i];
                }
                if(arr[i] < smallestNeg){
                    smallestNeg = arr[i];
                }
            }
            else if(arr[i] == 0){
                countZero += 1;
            }
            else{
                countPos += 1;
                PdtPos *= arr[i];
            }
        }

        // Cases to find MinProduct

        if(countNeg == 0){ // No negatives
            if(countZero > 0){
                list.add((long)(0));
            }
            else{
                long min = Integer.MAX_VALUE;
                for(int i=0; i<n; i++){
                    if(arr[i] < min){
                        min = arr[i];
                    }
                }
                list.add(min);
            }
        }
        else{
            if(countNeg % 2 == 0){   //Even number of negatives
                long min= (PdtNeg / largestNeg) * PdtPos;
                list.add(min);
            }
            else{   //Odd number of negatives
                list.add(PdtNeg * PdtPos);
            }
        }

        // Cases to find MaxProduct

        if(countNeg == 0 && countPos == 0){ // Only zeroes are present
            list.add(0,(long)(0));
        }
        else if(countNeg == 0 && countPos != 0){ // No negatives are present
            long max = PdtPos;
            list.add(0, max);
        }
        else if(countNeg % 2 == 0){ // Even negatives
            long max = (PdtNeg * PdtPos);
            list.add(0,max);
        }
        else{ // Odd negatives
            if (countZero > 0 && countPos == 0) {
                // zeros present and NO positives -> 0 is best max
                list.add(0, 0L);
            } else {
                // otherwise compute by excluding the negative closest to zero
                if (countNeg == 1 && countPos == 0 && countZero == 0) {
                    list.add(0, PdtNeg);
                } else {
                    long max = (PdtNeg * PdtPos) / largestNeg;
                    list.add(0, max);
                }
            }

        }

        return list;
    }
    public static void main(String[] args) {
        int arr[] = {0, 0, 0, 0, 0, 0,45, 0, 0, 0, -1};
        List<Long> list = maxMinProduct(arr);
        System.out.println(list);
    }
}
