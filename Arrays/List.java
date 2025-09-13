

import java.util.ArrayList;
import java.util.Scanner;

public class List {
    public static void main(String[] args) {
        System.out.println("Hello");
        ArrayList<Integer> list = new ArrayList<>();
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Input number of elements:");
            int n = in.nextInt();
            System.out.print("Enter elements:");
            for (int i = 0; i < n; i++) {
                list.add(in.nextInt());
            }
            System.out.println(list);
            //Removing elements
            list.remove(7);
            System.out.println(list);
        }
       
    }
}
