package Linked_list.Questions;

public class Merge_Lists {

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


    public static Merge_Lists merge(Merge_Lists first, Merge_Lists second){
        Node f = first.head;
        Node s = second.head;

        Merge_Lists ans = new Merge_Lists();

        while(f != null && s!= null){
            if(f.value < s.value){
                ans.InsertLast(f.value);
                f = f.next;
            }
            else{
                ans.InsertLast(s.value);
                s = s.next;
            }
        }
        while(f != null){
            ans.InsertLast(f.value);
            f = f.next;
        }
        while(s != null){
            ans.InsertLast(s.value);
            s = s.next;
        }

        return ans;
    }

    public static void main(String[] args) {
        Merge_Lists first = new Merge_Lists();
        Merge_Lists second = new Merge_Lists();
        
        first.InsertLast(1);
        first.InsertLast(2);
        first.InsertLast(3);
        first.InsertLast(4);

        second.InsertLast(1);
        second.InsertLast(2);
        second.InsertLast(9);

        Merge_Lists ans = Merge_Lists.merge(first, second);
        ans.Display();
    }
}
