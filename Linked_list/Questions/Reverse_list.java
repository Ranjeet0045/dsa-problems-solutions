package Linked_list.Questions;

import java.util.Scanner;

class ListNode{
    int val;
    ListNode next;

    public ListNode(){};
    public ListNode(int val){
        this.val = val;
    }
    public ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }
}
public class Reverse_list {

    public static ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;

        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the list: ");
        int n = sc.nextInt();

        ListNode list = new ListNode(0);
        ListNode node = list;

        System.out.print("Enter nodes of the list: ");
        for(int i=0; i<n; i++){
            int val = sc.nextInt();
            node.next = new ListNode(val);
            node = node.next;
        }

        ListNode ans = reverseList(list.next);
        while(ans != null){
            System.out.print(ans.val + " -> ");
            ans = ans.next;
        }
        System.out.println("null");
        sc.close();
    }
}
