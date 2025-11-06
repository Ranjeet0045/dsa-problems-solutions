import java.util.ArrayList;
import java.util.Collections;

public class Sort_in_nonDecreasing_order {

    public static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
        public ListNode(int val,ListNode next){
            this.next = next;
            this.val = val;
        }
    }

    public static ListNode helper(ListNode head){
        if (head == null || head.next == null) return head;

        ArrayList<Integer> list = new ArrayList<>();
        ListNode curr = head;
        while (curr != null) {
            list.add(curr.val);
            curr = curr.next;
        }

        Collections.sort(list);

        curr = head;
        int index = 0;
        while (curr != null) {
            curr.val = list.get(index++);
            curr = curr.next;
        }

        return head;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(13);
        head.next = new ListNode(99);
        head.next.next = new ListNode(21);
        head.next.next.next = new ListNode(80);
        head.next.next.next.next = new ListNode(50);

        ListNode ans = helper(head);

        while(ans != null){
            System.out.print(ans.val + " ->");
            ans = ans.next;
        }
        System.out.println("null");
    }
}
