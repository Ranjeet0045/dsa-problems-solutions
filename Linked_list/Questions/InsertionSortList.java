package Linked_list.Questions;

public class InsertionSortList {

    static class ListNode{
        ListNode next;
        int val;

        public ListNode(int val, ListNode next){
            this.val = val;
            this.next = next;
        }

        public ListNode(int val){
            this.val = val;
        }

    }

    static ListNode insertSort(ListNode head){
        ListNode curr = head;
        ListNode dummy = new ListNode(0);

        while(curr != null){

            // AT each iteration, prev points to the dummy
            ListNode prev = dummy;
            ListNode next = curr.next;// Stores next value of curr

            //Traverse till you find a node which greater than prev val
            while(prev.next != null && prev.next.val < curr.val){
                prev = prev.next;
            }

            //Insert curr between prev and prev.next
            curr.next = prev.next;
            prev.next = curr;

            //Move to the next node
            curr = next;
        }
        
        return dummy.next;
    }

    public static void main(String[] args) {
        //4,2,1,3
        ListNode a = new ListNode(4);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(1);
        ListNode d = new ListNode(3);

        a.next = b;
        b.next = c;
        c.next = d;

        ListNode ans = insertSort(a);
        while(ans != null){
            System.out.print(ans.val + " ");
            ans = ans.next;
        }
    }
}
