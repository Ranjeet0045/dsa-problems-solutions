package Linked_list.Basics;

public class PrintRecursive {

    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void displayRecursive(Node head){
        if(head == null){
            return;
        }
        System.out.print(head.data + " -> ");
        displayRecursive(head.next);
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        displayRecursive(a);
        System.out.print("null");
    }
}
