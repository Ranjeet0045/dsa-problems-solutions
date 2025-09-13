package Tree;

class Node{
    int value;
    Node left;
    Node right;

    public Node(int value){
        this.value = value;
        left = null;
        right = null;
    }
}



public class Make_BST {
    
    public static Node insert(Node root,int value){
        if(root == null) return new Node(value);

        if(value < root.value){
            root.left = insert(root.left, value);
        }
        else{
            root.right = insert(root.right, value);
        }
        return root;
    }

    public static Node arrayToBST(int[] arr){
        Node root = null;
        for (int val : arr) {
            root = insert(root, val);
        }
        return root;
    }

    public static void inorder(Node root){
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.value + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        int[] arr = {9,8,4,6,7,2,5,3};
        Node root = arrayToBST(arr);

        System.out.println("Inorder traversal of constructed BST:");
        inorder(root);
    }

}
