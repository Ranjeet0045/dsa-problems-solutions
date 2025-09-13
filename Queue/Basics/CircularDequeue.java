package Queue.Basics;

public class CircularDequeue {
    int[] data;
    int front;
    int rear;
    int size;
    int capacity;

    public CircularDequeue(int k) {
        this.data = new int[k];
        this.capacity = k;
        this.front = 0;
        this.rear = 0;
        this.size = 0;
    }
    
    public boolean insertFront(int value) {
        if (isFull()) return false;
        front = (front - 1 + capacity) % capacity;
        data[front] = value;
        size++;
        return true;
    }
    
    public boolean insertLast(int value) {
        if(isFull()){
            return false;
        }
        data[rear] = value;
        rear = (rear + 1) % capacity;
        size++;
        return true;
    }
    
    public boolean deleteFront() {
         if (isEmpty()){
        return false;
        }
        front = (front + 1) % capacity;
        size--;
        return true;
    }
    
    public boolean deleteLast() {
        if(isEmpty()){
            return false;
        }
        rear = (rear - 1 + capacity) % capacity;
        size--;
        return true;
    }
    
    public int getFront() {
        if(isEmpty()){
            return -1;
        }
        return data[front];
    }
    
    public int getRear() {
        if(isEmpty()){
            return -1;
        }
        return data[(rear - 1 + capacity) % capacity];
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        return size == capacity;
    }

    public void display() {
        if(isEmpty()){
            System.out.println("Queue is Empty");
        }
        int i = front;
        do{
            System.out.print(data[i] + " ");
            i++;
            i %= data.length;
        }
        while(i != rear);
    }

    public static void main(String[] args) {
        CircularDequeue queue = new CircularDequeue(5);
        queue.insertFront(25);
        queue.insertFront(20);
        queue.insertFront(30);
        queue.insertFront(56);
        queue.insertLast(20);

        queue.display();
        System.out.println();

        System.out.println(queue.deleteFront());
        queue.display();
        System.out.println();

        System.out.println(queue.deleteLast());
        queue.display();
    }
}
