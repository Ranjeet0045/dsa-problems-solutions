
import java.util.ArrayList;

// package New_Arrays;

public class Array_list {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(2);
        list.add(1);
        System.out.println(list);
        System.out.println(list.get(3));
        list.remove(3);
        System.out.println(list);
    }
}
