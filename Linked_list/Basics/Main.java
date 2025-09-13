package Linked_list.Basics;

public class Main {
    public static void main(String[] args) {
        // Singly_Linked_List list = new Singly_Linked_List(); 

        // System.out.print("Your linked list is : ");

        // list.InsertFirst(3);
        // list.InsertFirst(2);
        // list.InsertFirst(8);
        // list.InsertFirst(17);

        // list.InsertLast(99);                 
        // list.InsertLast(76);

        // list.InsertIndex(45,4);
        // list.InsertIndex(90,3);

        // list.Display();
        // System.out.println("Deleted element is : " + list.deleteFirst());
        // System.out.print("After deletion list is : ");
        // list.Display();

        // System.out.println("Last element is : " + list.deleteLast());
        // System.out.print("After deletion list is : ");
        // list.Display();

        // System.out.println("Current deleted element : " + list.deleteIndex(2));
        // System.out.print("After deletion list is : ");
        // list.Display();

        // System.out.println("Index of element 45 is : " + list.findIndex(45));

        Circular_Linked_List list = new Circular_Linked_List();
        list.Insert(34);
        list.Insert(54);
        list.Insert(43);
        list.Insert(32);
        list.Insert(89);

        list.Display();

        list.Delete(32);

        list.Display();
    }
}
