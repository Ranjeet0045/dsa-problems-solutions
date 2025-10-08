
import java.util.TreeMap;

public class Inbuilt_tree {
    public static void main(String[] args) {
        // Using TreeMap as an example of a built-in tree structure
        TreeMap<Integer, String> tree = new TreeMap<>();
        tree.put(1, "One");
        tree.put(2, "Two");
        tree.put(3, "Three");

        // Printing the tree structure
        System.out.println("Tree contents: " + tree);
    }
}
