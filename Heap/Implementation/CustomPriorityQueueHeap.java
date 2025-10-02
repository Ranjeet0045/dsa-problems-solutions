package Heap.Implementation;

class PriorityQueueUsingHeap {
    private int[] heap;
    private int size;
    private int capacity;

    public PriorityQueueUsingHeap(int capacity) {
        this.capacity = capacity;
        this.heap = new int[capacity];
        this.size = 0;
    }

    private int parent(int i) { return (i - 1) / 2; }
    private int leftChild(int i) { return 2 * i + 1; }
    private int rightChild(int i) { return 2 * i + 2; }

    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    // Enqueue (insert with priority)
    public void enqueue(int val) {
        if (size == capacity) throw new IllegalStateException("Priority Queue is full!");

        heap[size] = val;
        int current = size;
        size++;

        // Heapify up
        while (current > 0 && heap[current] < heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    // Dequeue (remove element with highest priority = smallest number in Min Heap)
    public int dequeue() {
        if (size == 0) throw new IllegalStateException("Priority Queue is empty!");

        int min = heap[0];
        heap[0] = heap[size - 1];
        size--;

        heapifyDown(0);
        return min;
    }

    private void heapifyDown(int i) {
        int smallest = i;
        int left = leftChild(i);
        int right = rightChild(i);

        if (left < size && heap[left] < heap[smallest]) {
            smallest = left;
        }
        if (right < size && heap[right] < heap[smallest]) {
            smallest = right;
        }
        if (smallest != i) {
            swap(i, smallest);
            heapifyDown(smallest);
        }
    }

    // Peek at the highest priority element
    public int peek() {
        if (size == 0) throw new IllegalStateException("Priority Queue is empty!");
        return heap[0];
    }

    // Utility to check size
    public int getSize() {
        return size;
    }

    // Utility to check if empty
    public boolean isEmpty() {
        return size == 0;
    }
}

// Testing
public class CustomPriorityQueueHeap {
    public static void main(String[] args) {
        PriorityQueueUsingHeap pq = new PriorityQueueUsingHeap(10);

        pq.enqueue(30);
        pq.enqueue(10);
        pq.enqueue(20);
        pq.enqueue(5);

        System.out.println("Peek (highest priority): " + pq.peek()); // 5
        System.out.println("Dequeue: " + pq.dequeue()); // 5
        System.out.println("Dequeue: " + pq.dequeue()); // 10
        System.out.println("Peek: " + pq.peek()); // 20
    }
}

