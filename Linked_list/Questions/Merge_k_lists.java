package Linked_list.Questions;
import java.util.*;

public class Merge_k_lists {

    static class ListNode{
        int val;
        ListNode next;
        
        public ListNode(int val){this.val = val;}
        public ListNode(int val, ListNode next){
            this.val = val;
            this.next = next;
        }
    }

    private static ListNode solve(ListNode[] arr) {
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++){
            ListNode curr = arr[i];
            while(curr != null){
                list.add(curr.val);
                curr = curr.next;
            }
        }
        Collections.sort(list);
        ListNode dummy = new ListNode(0);
        ListNode ans = dummy;
        for(int i=0; i<list.size(); i++){
            ans.next = new ListNode(list.get(i));
            ans = ans.next;
        }

        return dummy.next;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of lists: ");
        int k = sc.nextInt();
        ListNode[] arr = new ListNode[k];
        for(int i=0; i<k; i++){
            System.out.print("Enter number of nodes in " + i + "th node: ");
            int n = sc.nextInt();
            System.out.print("Enter nodes of " + i + "th node: ");
            ListNode root = new ListNode(0);
            ListNode list = root;
            for(int j=0; j<n; j++){
                list.next = new ListNode(sc.nextInt());
                list = list.next;
            }
            arr[i] = root.next;
        }
        ListNode ans = solve(arr);
        System.out.print("Sorted list after merging all nodes: ");
        while(ans != null){
            System.out.print(ans.val + " -> ");
            ans = ans.next;
        }
        System.out.println("null");
        sc.close();
    }
}
