package Linked_list.Basics;


public class Singly_Linked_List {

    private Node head;
    private Node tail;
    private int size;
    
    public Singly_Linked_List(){
        this.size = 0;
    }

    public void Display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
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

    public void InsertIndex(int value, int idx){

        if(idx == 0){
            InsertFirst(value);
            return;
        }
        if(idx == size){
            InsertLast(value);
            return;
        }

        Node temp = head;
        for(int i=1; i<idx; i++){
            temp = temp.next;
        }

        Node node = new Node(value, temp.next);
        temp.next = node;
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

    public int deleteFirst(){
        int value = head.value;
        head = head.next;

        if(head == null){
            tail = null;
        }
        size -= 1;
        return value;
    }

    public Node get(int idx){
        Node node = head;
        for (int i = 0; i < idx; i++) {
            node = node.next;
        }
        return node;
    }

    public int deleteLast(){
        if(size <= 1){
            return deleteFirst();
        }

        Node secondLast = get(size - 2);
        int value = tail.value;
        tail = secondLast;
        tail.next = null;
        return value;
    }

    public int deleteIndex(int idx){
        if(idx == 0){
            deleteFirst();
        }
        if(idx == size-1){
            deleteLast();
        }

        Node prev = get(idx - 1);
        int value = prev.next.value;
        prev.next = prev.next.next;

        return value;
    }

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

    public int findIndex(int value){
        Node node = head;
        int index = 0;
        while(node != null){
            if(node.value == value){
                return index;
            }
            node = node.next;
            index++;
        }
        return -1;
    }

    private class Node {
        Node next;
        private int value;

    @Override
    public String toString() {
        return "Node(value=" + value + ")";
    }

        public Node (int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
}
