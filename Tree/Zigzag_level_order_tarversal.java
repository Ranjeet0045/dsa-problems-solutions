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

public class Zigzag_level_order_tarversal {

    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        dfs(root, 0, ans);
        return ans;
    }

    private static void dfs(TreeNode root, int level, List<List<Integer>> ans) {
        if(root == null) return;

        if(level == ans.size()){
            ans.add(new LinkedList<>());
        }

        if(level % 2 == 0){
            ans.get(level).add(root.val);
        }
        else{
            ans.get(level).add(0,root.val);
        }

        dfs(root.left, level+1, ans);
        dfs(root.right, level+1, ans);
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
        TreeNode root = formTree(arr);
        List<List<Integer>> ans = zigzagLevelOrder(root);
        System.out.println(ans);
        sc.close();
    }

    private static TreeNode formTree(int[] arr) {
        int n = arr.length;
        if(n == 0 || arr[0] == -1) return null;

        TreeNode root = new TreeNode(arr[0]);
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int i = 1;

        while(!q.isEmpty() && i < n){
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
}
