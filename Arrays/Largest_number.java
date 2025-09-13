import java.util.*;

public class Largest_number {

    static String largestNumber(int[] nums) {

        String[] arr = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = String.valueOf(nums[i]);
        }

        // Sort the array with a custom comparator
        Arrays.sort(arr, new Comparator<String>() {
            // Define how to compare two strings a and b
            public int compare(String a, String b) {
                // Concatenate strings in both possible orders
                String order1 = a + b; // a followed by b
                String order2 = b + a; // b followed by a

                // Compare order2 with order1 to sort in descending order
                // If order2 is lexicographically larger, b should come before a
                return order2.compareTo(order1);
            }
        });

        // If after sorting the largest number is "0", return "0"
        if (arr[0].equals("0")) {
            return "0";
        }

        // Build the largest number by concatenating the sorted strings
        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            sb.append(s);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        int[] arr = {3,30,34,5,9};
        String ans = largestNumber(arr);
        System.out.println(ans);
    }
}
