package Queue.Basics;

import java.util.ArrayDeque;
import java.util.Deque;


public class Dequeue {
    public static void main(String[] args) {
        Deque<Integer> queue = new ArrayDeque<>();

        queue.add(90);
        queue.addFirst(45);
        queue.addLast(48);

        System.out.println(queue.removeFirst());
        System.out.println(queue.removeLast());
        
        System.out.println(queue.peek());
    }
}
