package Linked_list.Questions;

public class Swap_nodes {

    public static class ListNode{
        int val;
        ListNode next;
        public ListNode(int val, ListNode next){
            this.val = val;
            this.next = next;
        }
        public ListNode (int val){
            this.val = val;
        }
    }


    static ListNode swapNodes(ListNode head, int k) {
        ListNode temp = head;
        int size = 0;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        
        ListNode first = head;
        for(int i=1; i<k; i++){
            first = first.next;
        }

        ListNode last = head;
        for(int i=1; i<size-k+1; i++){
            last = last.next;
        }

        int curr = first.val;
        first.val = last.val;
        last.val = curr;

        return head;
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);
        
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        int k = 2;
        ListNode ans =  swapNodes(a,k);

        // Print the swapped linked list
        ListNode curr = ans;
        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.print("null");
    }
}
