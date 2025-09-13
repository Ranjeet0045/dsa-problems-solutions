package Linked_list.Basics;

    class Node{

        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

public class List_print {

        public static void display(Node head){
            while(head != null){
                System.out.print(head.data + " -> ");
                head = head.next;
            }
        }

        public static void main(String[] args) {
            Node a = new Node(2);
            Node b = new Node(12);
            Node c = new Node(8);
            Node d = new Node(98);
            Node e = new Node(65);

            a.next = b;
            b.next = c;
            c.next = d;
            d.next = e;

            display(a);
            System.out.print("null");

        }
    }
