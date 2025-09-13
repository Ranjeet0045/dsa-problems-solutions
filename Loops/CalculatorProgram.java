package Loops;

import java.util.Scanner;

public class CalculatorProgram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int result = 0;
        while (true) { 
            System.out.print("Enter an operator (+, -, *, /, %, or x to exit): ");
            char op = in.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.println("Enter two numbers:");
                int num1 = in.nextInt();
                int num2 = in.nextInt();
                if(op=='+'){
                    result = num1 + num2;
                }
                if(op=='-'){
                    result = num1 - num2;
                }     
                if(op=='*'){
                    result = num1 * num2;
                }
                if(op=='/'){
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error: Division by zero!");
                        continue; 
                    }
                }
                if(op=='%'){
                    result = num1 % num2;
                }      
            } else if (op == 'X' || op == 'x') {
                System.out.println("Exited the program.");
                break; 
            } else {
                System.out.println("Invalid Operator...");
                continue; 
            }
            System.out.println("Your result: " + result);
        }
        in.close(); 
    }
}