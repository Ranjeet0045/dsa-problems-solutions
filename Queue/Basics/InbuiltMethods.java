package Queue.Basics;

import java.util.LinkedList;
import java.util.Queue;

public class InbuiltMethods {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(6);
        queue.add(8);
        queue.add(10);

        System.out.println(queue.remove());
        System.out.println(queue.remove());

    }
}
