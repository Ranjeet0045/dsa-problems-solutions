package Functions;

import java.util.Scanner;

public class BasicSyntax {
    public static void main(String[] args){
    //Calling a function
        sum();
    } 
    //Initializing a function
    static void sum(){
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter 1st number:");
            int num1 = in.nextInt();
            System.out.print("Enter 2nd number:");
            int num2 = in.nextInt();
            int sum = num1 + num2;
            System.out.print("Sum is : " + sum);
        }
    }
}
