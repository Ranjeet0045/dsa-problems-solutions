package Loops;

import java.util.Scanner;

public class Fibonnaci {
    public static void main(String[] args) {
        int a=0,b=1,n;
        int sum=0;
       System.out.print("Enter the required term:");
       Scanner in=new Scanner(System.in);
       n=in.nextInt();
        for(int i=2;i<=n;i++){
            sum=a+b;
            a=b;
            b=sum;
        }
        System.out.println("Required term is:"+sum);
        in.close();
       }
    
}

