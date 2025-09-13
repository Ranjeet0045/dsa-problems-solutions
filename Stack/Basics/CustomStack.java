package Stack.Basics;

public class CustomStack {
    public int[] data;
    private static final int DEFAULT_SIZE = 10; //Let initial size is 10....

    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size){
        this.data = new int[size];
    }

    int ptr = -1;

    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is full....");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty...");
        }
        int removed = data[ptr];
        ptr--;
        return removed;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty...");
        }
        return data[ptr];
    }

    public boolean isFull(){
        return ptr == data.length-1;
    }

    public boolean isEmpty(){
        return ptr == -1;
    }

    public static void main(String[] args) {
        CustomStack stack = new CustomStack(5);

        stack.push(45);
        stack.push(32);
        stack.push(85);
        stack.push(25);
        stack.push(16);
        // stack.push(32);

        System.out.println(stack.peek());

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        // System.out.println(stack.pop());

    }
}
