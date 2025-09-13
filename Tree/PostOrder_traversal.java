package Tree;

public class PostOrder_traversal {
    public class Node {
        private int value;
        private int height;
        private Node left;
        private Node right;

        public Node (int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
    private Node root;

    public PostOrder_traversal() {

    }
    public int height(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void insert (int value) {
        root = insert(value, root);
    }

    private Node insert(int value, Node node){
        if(node == null){
            node = new Node(value);
            return node;
        }
        if(value < node.value){
            node.left = insert(value,node.left);
        }
        if(value > node.value){
            node.right = insert(value,node.right);
        }
        node.height = Math.max(height(node.left),height(node.right)) + 1;

        return node;
    }

    public void populate(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            this.insert(nums[i]);
        }
    }

    public void PostOrderDisplay() {
        PostOrderDisplay(root);
    }

    public void PostOrderDisplay(Node node) {
        if(node == null){
            return;
        }

        PostOrderDisplay(node.left);
        PostOrderDisplay(node.right);
        System.out.print(node.value + " ");
    }

    public static void main(String[] args) {
        PostOrder_traversal tree = new PostOrder_traversal();
        int[] nums = {5,2,7,1,4,6,9,8,3,10};
        tree.populate(nums);
        tree.PostOrderDisplay();
    }
}
