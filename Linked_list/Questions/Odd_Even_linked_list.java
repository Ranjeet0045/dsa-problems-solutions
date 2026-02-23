package Linked_list.Questions;

public class Odd_Even_linked_list {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
        ListNode(int val, ListNode next){
            this.val = val;
            this.next = next;
        }
    }
    public static ListNode oddEvenList(ListNode head){
        if(head == null || head.next == null) return head;
        ListNode odd = head;
        ListNode even = odd.next;
        ListNode evenHead = even;

        while(even != null && even.next != null){
            odd.next = even.next;
            odd = odd.next;

            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        node.next.next.next.next = new ListNode(5);
        ListNode ans = oddEvenList(node);
        
        while(ans != null){
            System.out.print(ans.val + " -> ");
            ans = ans.next;
        }
        System.out.println("null");
    }
}
