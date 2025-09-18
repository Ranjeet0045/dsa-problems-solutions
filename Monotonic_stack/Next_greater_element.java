package Monotonic_stack;

import java.util.Stack;

public class Next_greater_element {
    static void printNGE(int arr[], int n) {
        Stack<Integer> s = new Stack<>();
        s.push(arr[0]);

        for (int i = 1; i < n; i++) {

            if (s.empty()) {
                s.push(arr[i]);
                continue;
            }

            while (!s.empty() && s.peek() < arr[i]) {
                System.out.println(s.peek() + " --> " + arr[i]);
                s.pop();
            }

            s.push(arr[i]);
        }

        while (!s.empty()) {
            System.out.println(s.peek() + " --> " + -1);
            s.pop();
        }
    }

    public static void main(String[] args) {
        int arr[] = { 11, 13, 21, 3 };
        int n = arr.length;
        printNGE(arr, n);
    }
}
