package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class Longest_univalue_path {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    int ans = 0;
    public int longestUnivaluePath(TreeNode root) {

        helper(root);
        return ans;
    }
    public int helper(TreeNode root){
        if(root == null) return 0;

        int left = helper(root.left);
        int right = helper(root.right);

        int leftpath = 0, rightpath = 0;

        if(root.left != null && root.left.val == root.val){
            leftpath = left + 1;
        }
        if(root.right != null && root.right.val == root.val){
            rightpath = right + 1;
        }

        ans = Math.max(ans,leftpath+rightpath);
        return Math.max(leftpath,rightpath);
    }

    public TreeNode buildTree(Integer[] arr) {
        if (arr == null || arr.length == 0 || arr[0] == null) return null;

        TreeNode root = new TreeNode(arr[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int i = 1;
        while (!queue.isEmpty() && i < arr.length) {
            TreeNode current = queue.poll();
            if (i < arr.length && arr[i] != null) {
                current.left = new TreeNode(arr[i]);
                queue.offer(current.left);
            }
            i++;
            if (i < arr.length && arr[i] != null) {
                current.right = new TreeNode(arr[i]);
                queue.offer(current.right);
            }
            i++;
        }
        return root;
    }

    public static void main(String[] args) {
        Longest_univalue_path solution = new Longest_univalue_path();

        Integer[] arr = {5,4,5,1,1,null,5};
        TreeNode root = solution.buildTree(arr);

        System.out.println(solution.longestUnivaluePath(root));
    }
}
