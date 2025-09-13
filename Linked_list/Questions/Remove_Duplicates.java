package Linked_list.Questions;


public class Remove_Duplicates {


    private Node head;
    public int size;
    private Node tail;

    private class Node {
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
    }

    public void InsertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }

        size += 1;
    }

    public void InsertLast(int value){
        if(tail == null){
            InsertFirst(value);
            return;
        }

        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size += 1;
    }

    public void Display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }


    public void duplicates(){
        Node node = head;
        
        while(node.next != null){
            if(node.value == node.next.value){
                node.next = node.next.next;
                size--;
            }
            else{
                node = node.next;
            }
        }
        tail = node;
        tail.next = null;
    }

    public static void main(String[] args) {
        Remove_Duplicates list = new Remove_Duplicates();

        list.InsertLast(1);
        list.InsertLast(1);
        list.InsertLast(2);
        list.InsertLast(2);
        list.InsertLast(2);
        list.InsertLast(3);

        list.Display();
        list.duplicates();
        list.Display();

    }

}
