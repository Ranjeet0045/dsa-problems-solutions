package Functions;

import java.util.Scanner;

public class Max_And_Min_among_3 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter num1:");
            int num1 = in.nextInt();
            System.out.print("Enter num2:");
            int num2 = in.nextInt();
            System.out.print("Enter num3:");
            int num3 = in.nextInt();
            
            int x = fun(num1,num2,num3);
            System.out.print(x);
        }
    }

    static int fun(int num1,int num2,int num3){
        if(num1>num2 && num1>num3){
            System.out.println("Num1 is maximum");
        }
        else if(num2>num1 && num2>num3){
            System.out.println("Num2 is maximum");
        }
        else{
            System.out.println("Num3 is maximum");
        }
        if(num1<num2 && num1<num3){
            System.out.println("Num1 is minimum");
        }
        else if(num2<num3 && num2<num1){
            System.out.println("Num2 is minimum");
        }
        else{
            System.out.println("Num3 is minimum");
        }
                return 0;
    }
}

