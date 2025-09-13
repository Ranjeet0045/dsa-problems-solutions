

import java.util.Scanner;

public class SwappingWithoutTemp {

    static void swap(int x,int y){
        x = x + y ;
        y = x - y ;
        x = x - y ;
        System.out.print("Value after swapping : " + x + " " + y);

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two numbers :");
        int x = in.nextInt();
        int y = in.nextInt();
        swap(x,y);
        in.close();
    }

}