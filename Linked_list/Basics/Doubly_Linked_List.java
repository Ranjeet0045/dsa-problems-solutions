package Linked_list.Basics;

public class Doubly_Linked_List{

    private Node head;

    public Node find(int value){
        Node node = head;
        while(node != null){
            if(node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void InsertAfter(int after,int value){
        Node p = find(after);

        if(p == null){
            System.out.println("Does not exist.");
            return;
        }
        Node node = new Node(value);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if(node.next != null){
            node.next.prev = node;
        }

    }

    public void InsertLast(int value){
        Node node = new Node(value);
        Node last = head;

        if(head == null){
            node.prev = null;
            head = node;
            return;
        }

        while(last.next != null){
            last = last.next;
        }

        last.next = node;
        node.prev = last;
    }

    public void InsertFirst(int value){
        Node node = new Node(value);
        Node last = head;

        if(head == null){
            node.prev = null;
            head = node;
            return;
        }

        while(last.next != null){
            last = last.next;
        }

        last.next = node;
        node.prev = last;
    }


    public void Display(){
        Node node = head;
        while(node != null){
            System.out.print(node.value + " -> ");
            node = node.next;
        }
        System.out.println("End");
    }

    public void ReverseDisplay(){
        Node node = head;
        Node last = null;
        System.out.print("Normal list : ");
        while(node != null){
            System.out.print(node.value + " -> ");
            last = node;
            node = node.next;
        }

        System.out.print("End");
        System.out.println();
        System.out.print("Reverse of list : ");

        while(last != null){
            System.out.print(last.value + " -> ");
            last = last.prev;
        }
        System.out.println("Start");
    }



    private class Node {
        int value;
        Node next;
        Node prev;

        public Node (int value){
        this.value = value;
        }
    }

    public static void main(String[] args) {
        Doubly_Linked_List list = new Doubly_Linked_List();
        list.InsertFirst(3);
        list.InsertFirst(2);
        list.InsertFirst(8);
        list.InsertFirst(17);

        list.InsertLast(99);

        list.InsertAfter(8, 89);

        list.Display();
        // list.ReverseDisplay();
    }

}