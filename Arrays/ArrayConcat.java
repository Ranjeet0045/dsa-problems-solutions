

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayConcat {
    public static void main(String[] args) {
        Integer[] array1 = {1, 21, 3};
        Integer[] array2 = {4, 5, 6};

        // Convert arrays to lists and concatenate them
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array1));
        list.addAll(Arrays.asList(array2));

        // Convert list back to array
        Integer[] result = list.toArray(new Integer[0]);

        // Print the concatenated array
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}

