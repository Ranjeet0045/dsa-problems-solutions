package Linked_list.Questions;

import java.util.HashSet;
import java.util.Set;

class ListNode {
    ListNode next;
    int val;

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class Delete_nodes {

    public static ListNode modifiedList(int[] nums, ListNode head) {

        //use a set for quick lookup
        Set<Integer> set = new HashSet<>();
        for (int x : nums) set.add(x);

        while (head != null && set.contains(head.val)) { //If starting nodes has to be deleted...
            head = head.next;
        }

        if (head == null) return null;

        ListNode node = head;

        while (node.next != null) {
            if (set.contains(node.next.val)) {
                node.next = node.next.next;
            } else {
                node = node.next;
            }
        }

        return head;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3};

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode ans = modifiedList(nums, head);

        while (ans != null) {
            System.out.print(ans.val + " -> ");
            ans = ans.next;
        }
        System.out.print("null");
    }
}
