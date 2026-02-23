package Linked_list.Questions;

import java.util.Scanner;

class ListNode{
    int val;
    ListNode next;
    public ListNode(int val){
        this.val = val;
    };
    public ListNode(int val, ListNode next){
        this.val = val;
        this.next = next;
    }
}
public class Merge_two_sorted_lists {

    //Merging in a separate third linked list
    public static ListNode mergeTwoLists1(ListNode list1, ListNode list2) {
        ListNode ans = new ListNode(0);
        ListNode dummy = ans;

        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                dummy.next = list1;
                dummy = dummy.next;
                list1 = list1.next;
            }
            else{
                dummy.next = list2;
                dummy = dummy.next;
                list2 = list2.next;
            }
        }
        while(list1 != null){
            dummy.next = list1;
            dummy = dummy.next;
            list1 = list1.next;
        }
        while(list2 != null){
            dummy.next = list2;
            dummy = dummy.next;
            list2 = list2.next;
        }
        return ans.next;
    }

    //Without using extra third list
    private static ListNode mergeTwoLists2(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;

        ListNode head;
        ListNode tail;

        //step 1 : Decide head
        if(list1.val <= list2.val){
            head = list1;
            list1 = list1.next;
        }
        else{
            head = list2;
            list2 = list2.next;
        }

        tail = head;

        //step 2 : Merge remaining nodes
        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                tail.next = list1;
                list1 = list1.next;
            }
            else{
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;   
        }

        //step 3: Attach remaining nodes
        if(list1 != null){
            tail.next = list1;
        }
        else{
            tail.next = list2;
        }

        return head;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //First list
        System.out.print("Enter number of nodes of first list: ");
        int n = sc.nextInt();
        ListNode list1 = new ListNode(0);
        ListNode node1 = list1;
        System.out.print("Enter values of nodes in sorted order: ");
        for(int i=0; i<n; i++){
            int val = sc.nextInt();
            node1.next = new ListNode(val);
            node1 = node1.next;
        }

        //Second list
        System.out.print("Enter number of nodes of second list: ");
        int m = sc.nextInt();
        ListNode list2 = new ListNode(0);
        ListNode node2 = list2;
        System.out.print("Enter values of nodes in sorted order: ");
        for(int i=0; i<m; i++){
            int val = sc.nextInt();
            node2.next = new ListNode(val);
            node2 = node2.next;
        }

        //Merging
        // ListNode ans = mergeTwoLists1(list1.next, list2.next);
        ListNode ans = mergeTwoLists2(list1.next, list2.next);

        //Printing
        while(ans != null){
            System.out.print(ans.val + " -> ");
            ans = ans.next;
        }
        System.out.println("null");
        sc.close();
    }
}
