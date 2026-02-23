package Tree;

import java.util.*;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(){};
    public TreeNode(int val){
        this.val = val;
    }
    public TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class Symmetric_tree {

    public static boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return solve(root.left, root.right);
    }

    public static boolean solve(TreeNode node1, TreeNode node2){
        if(node1 == null && node2 == null) return true;
        if(node1 == null || node2 == null) return false;

        return (node1.val == node2.val) && solve(node1.left, node2.right) && solve(node1.right, node2.left);
    }

    private static TreeNode makeTree(int[] arr) {
        int n = arr.length;
        if(n == 0 || arr[0] == -1) return null;

        TreeNode root = new TreeNode(arr[0]);
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int i = 1;

        while(!q.isEmpty() && i<n){
            TreeNode curr = q.poll();

            if(i < n && arr[i] != -1){
                curr.left = new TreeNode(arr[i]);
                q.add(curr.left);
            }
            i++;

            if(i < n && arr[i] != -1){
                curr.right = new TreeNode(arr[i]);
                q.add(curr.right);
            }
            i++;
        }
        return root;
    }
    private static TreeNode makeTreeRecursive(int[] arr, int idx){
        if(idx >= arr.length || arr[idx] == -1){
            return null;
        }
        TreeNode root = new TreeNode(arr[idx]);
        root.left = makeTreeRecursive(arr, 2*idx + 1);
        root.right = makeTreeRecursive(arr, 2*idx + 2);

        return root;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements of the array: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        TreeNode root1 = makeTree(arr);
        TreeNode root2 = makeTreeRecursive(arr, 0);
        
        boolean ans1 = isSymmetric(root1);
        boolean ans2 = isSymmetric(root2);
        System.out.println(ans1);
        System.out.println(ans2);
        sc.close();
    }
}
