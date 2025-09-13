import java.util.Scanner;

public class TakingStringInput {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String input = in.nextLine();

            StringBuilder sb = new StringBuilder(input);
            StringBuilder reversed = new StringBuilder();

            for (int i = sb.length() - 1; i >= 0; i--) {
                reversed.append(sb.charAt(i));
            }

            System.out.println("Reversed String: " + reversed.toString());
        }
    }
}
