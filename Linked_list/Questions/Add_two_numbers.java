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

public class Add_two_numbers {

    private static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;

        while(l1 != null || l2 != null || carry != 0){
            int sum = carry;

            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }
            carry = sum/10;
            int digit = sum % 10;

            current.next = new ListNode(digit);
            current = current.next;
        }
        return dummy.next;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of 1st list: ");
        int n = sc.nextInt();
        ListNode list1 = new ListNode(0);
        ListNode node1 = list1;
        System.out.print("Enter values of nodes: ");
        for(int i=0; i<n; i++){
            int val = sc.nextInt();
            node1.next = new ListNode(val);
            node1 = node1.next;
        }

        System.out.print("Enter length of 2nd list: ");
        int m = sc.nextInt();
        ListNode list2 = new ListNode(0);
        ListNode node2 = list2;
        System.out.print("Enter values of nodes: ");
        for(int i=0; i<m; i++){
            int val = sc.nextInt();
            node2.next = new ListNode(val);
            node2 = node2.next;
        }
        ListNode ans = addTwoNumbers(list1.next, list2.next);
        while(ans != null){
            System.out.print(ans.val + " -> ");
            ans = ans.next;
        }
        System.out.println("null");
        sc.close();
    }
}
