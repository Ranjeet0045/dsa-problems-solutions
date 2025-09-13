package Linked_list.Basics;

public class Circular_Linked_List {

    private Node head;
    private Node tail;

    public Circular_Linked_List(){
        this.head = null;
        this.tail = null;
    }

    public void Insert(int value){
        Node node = new Node(value);
        if(head == null){
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void Delete(int value){
        Node node = head;
        if(node == null){
            return;
        }
        if(node.value == value){
            head = head.next;
            tail.next = head;
            return;
        }
        do{
            Node n = node.next;
            if(n.value == value){
                node.next = n.next;
                break;
            }
            node = node.next;
        }
        while(node != head);

    }

    public void Display(){
        Node node = head;
        if(head != null){
            do{
                System.out.print(node.value + " -> ");
                node = node.next;
            }
            while(node != head); 
        }
        System.out.println("Head");
    }

    private class Node {
        int value;
        Node next;

        public Node (int value){
        this.value = value;
    }
    }
}
