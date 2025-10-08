package Segment_tree;

class SegmentTree {

    // Node structure for the tree
    private static class Node {
        int data;
        int startInterval;
        int endInterval;
        Node left;
        Node right;

        public Node(int startInterval, int endInterval) {
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }
    }

    private Node root;

    // Constructor: builds the tree from an input array
    public SegmentTree(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty.");
        }
        this.root = constructTree(arr, 0, arr.length - 1);
    }

    // Recursively constructs the segment tree
    private Node constructTree(int[] arr, int start, int end) {
        if (start == end) {
            Node leaf = new Node(start, end);
            leaf.data = arr[start];
            return leaf;
        }

        Node node = new Node(start, end);
        int mid = (start + end) / 2;

        node.left = constructTree(arr, start, mid);
        node.right = constructTree(arr, mid + 1, end);

        node.data = node.left.data + node.right.data;
        return node;
    }

    // Display tree structure (for debugging)
    public void display() {
        display(this.root, "");
    }

    private void display(Node node, String indent) {
        if (node == null) return;
        System.out.println(indent + "[" + node.startInterval + "," + node.endInterval + "] => " + node.data);
        display(node.left, indent + "  ");
        display(node.right, indent + "  ");
    }

    // Query range sum between qsi and qei (inclusive)
    public int query(int qsi, int qei) {
        if (qsi > qei) {
            throw new IllegalArgumentException("Invalid query range: start > end.");
        }
        return query(this.root, qsi, qei);
    }

    private int query(Node node, int qsi, int qei) {
        // Completely inside range
        if (node.startInterval >= qsi && node.endInterval <= qei) {
            return node.data;
        }

        // Completely outside range
        if (node.endInterval < qsi || node.startInterval > qei) {
            return 0;
        }

        // Partially overlapping
        int leftSum = query(node.left, qsi, qei);
        int rightSum = query(node.right, qsi, qei);
        return leftSum + rightSum;
    }

    // Update value at a specific index
    public void update(int index, int value) {
        update(this.root, index, value);
    }

    private int update(Node node, int index, int value) {
        if (node.startInterval == node.endInterval) {
            // Leaf node
            if (node.startInterval == index) {
                node.data = value;
            }
            return node.data;
        }

        int mid = (node.startInterval + node.endInterval) / 2;
        if (index <= mid) {
            update(node.left, index, value);
        } else {
            update(node.right, index, value);
        }

        node.data = node.left.data + node.right.data;
        return node.data;
    }

    // Example usage
    public static void main(String[] args) {
        int[] arr = {3, 8, 6, 7, -2, -8, 4, 9};
        SegmentTree tree = new SegmentTree(arr);

        System.out.println("Initial Segment Tree:");
        tree.display();

        System.out.println("\nQuery (1, 6): " + tree.query(1, 6));  // expected 15

        System.out.println("\nUpdating index 3 to value 10...");
        tree.update(3, 10);

        System.out.println("\nUpdated Segment Tree:");
        tree.display();

        System.out.println("\nQuery (1, 6) after update: " + tree.query(1, 6)); // expected 18
    }
}
