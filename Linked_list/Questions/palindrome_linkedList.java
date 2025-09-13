package Linked_list.Questions;

class Node {
    int data;
    Node next;

    // constructor with only data
    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    // constructor with data and next
    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

public class palindrome_linkedList {

    static boolean isPallindrome(Node head) {
        if (head == null || head.next == null) return true;

        // Make a copy of the list
        Node copy = cloneList(head);

        // Reverse the copy
        Node temp = reverse(copy);

        // Compare original and reversed copy
        Node curr = head;
        while (curr != null && temp != null) {
            if (curr.data != temp.data) {
                return false;
            }
            curr = curr.next;
            temp = temp.next;
        }

        return true;
    }

    static Node reverse(Node head) {
        Node curr = head;
        Node prev = null;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    // helper to clone a linked list
    static Node cloneList(Node head) {
        if (head == null) return null;
        Node newHead = new Node(head.data);
        Node currOld = head.next, currNew = newHead;
        while (currOld != null) {
            currNew.next = new Node(currOld.data);
            currNew = currNew.next;
            currOld = currOld.next;
        }
        return newHead;
    }

    public static void main(String[] args) { 
        Node dummy = new Node(0); 
        Node node = dummy;

        int[] arr = {1,12,2,1}; 
        for(int i=0; i<4; i++){ 
            node.next = new Node(arr[i]);
            node = node.next;
        } 
        Node head = dummy.next;
        boolean ans = isPallindrome(head); 
        System.out.println(ans); 
    }
}
