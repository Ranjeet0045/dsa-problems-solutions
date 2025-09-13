package Functions;

import java.util.Scanner;

public class Voter_Or_Not {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter age:");
            int age = in.nextInt();
            int x = voter(age);
            System.out.print(x);
        }
    }
    static int voter(int age){
        if(age>18){
            System.out.println("Eligible for voting");
            return 1;
        }
        else{
            System.out.println("Not eligible");
            return 0;
        }
    }

}
