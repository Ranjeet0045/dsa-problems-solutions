package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigZag_traversal {
    public class TreeNode{
        int value;
        TreeNode left;
        TreeNode right;

        public TreeNode (int value){
            this.value = value;
        }
    }

    private TreeNode root;

    public void insert(int value) {
        root = insert(value,root);
    }

    private TreeNode insert(int value,TreeNode node){
        if(node == null){
            node = new TreeNode(value);
            return node;
        }
        if(value < node.value){
            node.left = insert(value,node.left);
        }
        if(value > node.value){
            node.right = insert(value,node.right);
        }
        return node;
    }

    public void populate(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            this.insert(nums[i]);
        }
    }

    public List<List<Integer>> display() {
        return display(root);
    }

    public List<List<Integer>> display(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean leftToRight = true;

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> list = new ArrayList<>(levelSize);

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.remove();
                if (leftToRight) {
                    list.add(node.value);
                } else {
                    list.add(0, node.value); // insert at beginning for reverse order
                }
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            result.add(list);
            leftToRight = !leftToRight;
        }
        return result;
    }

    public static void main(String[] args) {
        ZigZag_traversal tree = new ZigZag_traversal();
        int[] nums = {5,2,7,1,4,6,9,8,3,10};
        tree.populate(nums);
        System.out.println(tree.display());
    }
}
