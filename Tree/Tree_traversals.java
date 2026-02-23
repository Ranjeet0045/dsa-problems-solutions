package Tree;

import java.util.*;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(){};
    public TreeNode(int val){this.val = val;}
    public TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Tree_traversals{

    //InOrder traversal
    private static List<Integer> InorderTraverse(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        solveInorder(root, ans);
        return ans;
    }

    private static void solveInorder(TreeNode root, List<Integer> list){
        if(root == null){
            return;
        }
        solveInorder(root.left, list);
        list.add(root.val);
        solveInorder(root.right, list);
    }

    //PreOrder traversal
    private static List<Integer> PreorderTraverse(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        solvePreorder(root, ans);
        return ans;
    }

    private static void solvePreorder(TreeNode root, List<Integer> list){
        if(root == null){
            return;
        }
        list.add(root.val);
        solvePreorder(root.left, list);
        solvePreorder(root.right, list);
    }

    //Postorder traversal
    private static List<Integer> PostorderTraverse(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        solvePostorder(root, ans);
        return ans;
    }

    private static void solvePostorder(TreeNode root, List<Integer> list){
        if(root == null){
            return;
        }
        solvePostorder(root.left, list);
        solvePostorder(root.right, list);
        list.add(root.val);
    }

    private static TreeNode makeTreeRecursive(int[] arr, int idx) {
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
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        //Build tree
        // TreeNode root = makeTreeRecursive(arr, 0);
        TreeNode root = makeTreeIterative(arr);

        List<Integer> inOrder = InorderTraverse(root);
        List<Integer> preOrder = PreorderTraverse(root);
        List<Integer> postOrder = PostorderTraverse(root);
        System.out.println("Inorder tarversal: " + inOrder);
        System.out.println("Preorder traversal: " + preOrder);
        System.out.println("PostOrder traversal: " + postOrder);
        sc.close();
    }

    private static TreeNode makeTreeIterative(int[] arr) {
        if(arr.length == 0 || arr[0] == -1){
            return null;
        }
        TreeNode root = new TreeNode(arr[0]);
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int i = 1;

        while(!q.isEmpty() && i < arr.length){
            TreeNode curr = q.poll();

            if(i < arr.length && arr[i] != -1){
                curr.left = new TreeNode(arr[i]);
                q.add(curr.left);
            }
            i++;
            
            if(i < arr.length && arr[i] != -1){
                curr.right = new TreeNode(arr[i]);
                q.add(curr.right);
            }
            i++;
        }
        return root;
    }
}