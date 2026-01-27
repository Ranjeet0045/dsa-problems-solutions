package Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Max_width_of_Binary_tree {

    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val){
            this.val = val;
        }
        public TreeNode(TreeNode left, TreeNode right){
            this.left = left;
            this.right = right;
        }

    }
    
    private int maxWidth(TreeNode root) {
        throw new UnsupportedOperationException("Unimplemented method 'maxWidth'");
    }
    private TreeNode buildTree(int[] arr) {
        if(arr.length == 0 || arr[0] == -1){
            return null;
        }
        TreeNode root = new TreeNode(arr[0]);
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int i = 1;

        while(!q.isEmpty() && i<arr.length){
            TreeNode curr = q.poll();

            if(i<arr.length && arr[i] != -1){
                curr.left = new TreeNode(arr[i]);
                q.add(curr.left);
            }
            i++;

            if(i<arr.length && arr[i] != -1){
                curr.right = new TreeNode(arr[i]);
                q.add(curr.right);
            }
            i++;
        }
        return root;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        //Here
        Max_width_of_Binary_tree tree = new Max_width_of_Binary_tree();
        TreeNode root = tree.buildTree(arr);
        
        int result = tree.maxWidth(root);
        System.out.println(result);
        sc.close();
    }
}
