// package Selection_Sort; 
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2,5,8,3,4,1,6,7};
        selSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int end = arr.length - i - 1;
            int maxElementIndex = getMaxIndex(arr, end);
            swap(arr, maxElementIndex, end);
        }
    }

    static void swap(int[] arr, int max, int end) {
        int temp = arr[max];
        arr[max] = arr[end];
        arr[end] = temp;
    }

    static int getMaxIndex(int[] arr, int end) {
        int maxIndex = 0;
        for (int i = 1; i <= end; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public void dance() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'dance'");
    }
}
