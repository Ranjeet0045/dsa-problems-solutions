package Queue.Questions;

import java.util.Stack;

public class QueueUsingStack {

    private Stack<Integer> first;
    private Stack<Integer> second;
    public int size = 0;

    public  QueueUsingStack(){
        first = new Stack<>();
        second = new Stack<>();
    }

    public void push(int item){
        first.push(item);
        size++;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Queue is empty...");
            return -1;
        }
        if (second.isEmpty()) {
            while (!first.isEmpty()) {
                second.push(first.pop());
            }
        }
        size--;
        return second.pop();
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty...");
            return -1;
        }
        if (second.isEmpty()) {
            while (!first.isEmpty()) {
                second.push(first.pop());
            }
        }
        return second.peek();
    }

    public static void main(String[] args) {
        QueueUsingStack stack = new QueueUsingStack();

        stack.push(45);
        stack.push(98);

        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());

    }
}
