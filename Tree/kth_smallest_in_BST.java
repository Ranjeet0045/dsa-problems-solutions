package Tree;

import java.util.PriorityQueue;

class Newnode {
    int data;
    Newnode left, right;

    public Newnode(int data)
    {
        this.data = data;
        this.left = this.right = null;
    }
}

public class kth_smallest_in_BST {

    public static int kthSmallest(Newnode root, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        helper(pq,root);
        
        while(k > 1){
            pq.poll();
            k--;
        }

        return pq.peek() != null ? pq.peek() : -1;
    }
    public static void helper(PriorityQueue<Integer> pq,Newnode root){
        
        if(root == null) return;

        pq.add(root.data);
        helper(pq,root.left);
        helper(pq,root.right);
    }
    public static void main(String[] args) {
        int k = 3;
        Newnode root = new Newnode(20);
        root.left = new Newnode(8);
        root.right = new Newnode(22);
        root.left.left = new Newnode(4);
        root.left.right = new Newnode(12);
        root.left.right.left = new Newnode(10);
        root.left.right.right = new Newnode(14);

        int ans = kthSmallest(root,k);
        System.out.println(ans);
    }
}
