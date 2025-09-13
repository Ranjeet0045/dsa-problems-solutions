package Functions;

import java.util.Scanner;

public class Prime_Number {
      public static void main(String[] args) {
          try (Scanner in = new Scanner(System.in)) {
              System.out.print("Enter a number:");
              int number = in.nextInt();
              int x = prime(number);
              System.out.print(x);
          }
    }

    static int prime(int number){
        int count = 0;
        for(int i=1;i<=number;i++){
            if(number % i == 0){
                count++;
            }
        }
        if(count == 2){
            System.out.println("Number is prime");
        }else{
            System.out.println("Number is not prime");
        }
        return 0;
    }
}
