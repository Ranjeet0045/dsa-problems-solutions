package Switch_Case;

import java.util.Scanner;

public class SwitchFormat1 {
    public static void main(String[] args) {
        System.out.print("Enter any fruit name from Apple,Mango,Litchi,Banana:");
        try (Scanner in = new Scanner(System.in)) {
            String fruit = in.next();
            switch(fruit){
                case "Mango" -> System.out.println("King of fruits");
                case "Apple" -> System.out.println("A sweet red fruit");
                case "Litchi" -> System.out.println("A sweet seasonal fruit");
                case "Banana" -> System.out.println("Good for health");
                default -> System.out.println("Invalid fruit");
            }
        }
    }
}
