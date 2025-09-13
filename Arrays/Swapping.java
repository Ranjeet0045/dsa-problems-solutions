

import java.util.Scanner;

public class Swapping {

    static void swap(int x,int y){
        int temp = x;
        x = y;
        y = temp;
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
