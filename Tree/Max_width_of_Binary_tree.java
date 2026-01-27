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

    class Pair<K, V>{
        private K key;
        private V value;

        Pair(K key, V value){
            this.key = key;
            this.value = value;
        }
        public K getKey() {
            return key;
        }
        public V getValue(){
            return value;
        }
    }
    
    private int maxWidth(TreeNode root) {
        if(root == null) return 0;
        Queue<Pair<TreeNode, Long>> q = new LinkedList<>();
        q.offer(new Pair<>(root, 1L)); // (node, index)
        int maxWidth = 0;

        while(!q.isEmpty()){
            int size = q.size();
            long min = q.peek().getValue();
            long first = 0, last = 0;

            for(int i=0; i<size; i++){
                Pair<TreeNode, Long> p = q.poll();
                TreeNode node = p.getKey();
                long idx = p.getValue() - min;

                if(i == 0) first = idx;
                if(i == size-1) last = idx;

                if(node.left != null) q.offer(new Pair<>(node.left, 2*idx));
                if(node.right != null) q.offer(new Pair<>(node.right, 2*idx+1));
            }
            maxWidth = Math.max(maxWidth, (int)(last - first + 1));
        }
        return maxWidth;
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
        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();
        System.out.print("Enter elements of the array: ");
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        //Here
        Max_width_of_Binary_tree tree = new Max_width_of_Binary_tree();
        TreeNode root = tree.buildTree(arr);
        
        int result = tree.maxWidth(root);
        System.out.print("Width of the tree: ");
        System.out.println(result);
        sc.close();
    }
}
