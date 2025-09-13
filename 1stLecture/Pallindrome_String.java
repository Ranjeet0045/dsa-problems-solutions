import java.util.Scanner;

public class Pallindrome_String {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter any name:");
            String name = in.next();
            String y = name;
            String rev = "";
            int n = name.length();
            for (int i = n - 1; i >= 0; i--) {
                rev = rev + name.charAt(i);
            }
            if(rev.equals(y)){
                System.out.print("Pallindrome String");
            }
            else{
                System.out.print("Not pallindrome");
            }
        }
    }
}
