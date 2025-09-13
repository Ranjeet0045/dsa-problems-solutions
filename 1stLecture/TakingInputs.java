import java.util.Scanner;

public class TakingInputs {
    
    public static void main (String[] args){
        try(Scanner input = new Scanner(System.in)){ 
        
        System.out.print("Enter any Integer value:");
        int num=input.nextInt();
        System.out.println("Your Entered number is:" + num);
    }
  }
}
