package Stack.Basics;

import java.util.Stack;

public class InbuiltMethods {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(45);
        stack.push(86);
        stack.push(28);
        stack.push(76);
        stack.push(81);

        System.out.println(stack.peek());

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println(stack.peek());

        System.out.println(stack.size());
    }
}
