package Heap.Implementation;

class MinHeap {
    private int[] heap;
    private int size;
    private int capacity;

    public MinHeap(int capacity) {
        this.capacity = capacity;
        heap = new int[capacity];
        size = 0;
    }

    // Get parent/child indexes
    private int parent(int i) { return (i - 1) / 2; }
    private int leftChild(int i) { return 2 * i + 1; }
    private int rightChild(int i) { return 2 * i + 2; }

    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    // Insert new element
    public void insert(int val) {
        if (size == capacity) {
            throw new IllegalStateException("Heap is full!");
        }
        heap[size] = val;
        int current = size;
        size++;

        // Heapify up
        while (current > 0 && heap[current] < heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    // Get min (root)
    public int peek() {
        if (size == 0) throw new IllegalStateException("Heap is empty!");
        return heap[0];
    }

    // Remove min (root)
    public int extractMin() {
        if (size == 0) throw new IllegalStateException("Heap is empty!");

        int min = heap[0];
        heap[0] = heap[size - 1];
        size--;

        heapifyDown(0);
        return min;
    }

    // Heapify down
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

    // Print heap array
    public void printHeap() {
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }
}

// Testing
public class HeapExample {
    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap(10);

        minHeap.insert(5);
        minHeap.insert(3);
        minHeap.insert(8);
        minHeap.insert(1);

        minHeap.printHeap();  // Heap structure

        System.out.println("Peek (min): " + minHeap.peek());
        System.out.println("Extract Min: " + minHeap.extractMin());

        minHeap.printHeap();
    }
}
