package Conditionals;

import java.util.Scanner;

public class CheckLowerOrUpperCase {
    public static void main(String[] args){
        try(Scanner in=new Scanner(System.in)){
        System.out.print("Enter any Letter:");
        char letter = in.next().trim().charAt(0);
        
        if( letter > 'a' && letter < 'z' ){
            System.out.println("Lowercase");
        }
        else{
            System.out.println("Uppercase");
        }
    }
    }
}
