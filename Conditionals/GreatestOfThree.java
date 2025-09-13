package Conditionals;

import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args){
       try (Scanner input = new Scanner(System.in)) {
        System.out.print("Enter value of three numbers:");
           int a=input.nextInt();
           int b=input.nextInt();
           int c=input.nextInt();

           int max=a;
           if(b>max){
            max=b;
           }
           if(c>max){
            max=c;
           }

           System.out.println("Maximum value is:" + max);
        }
    }
}
