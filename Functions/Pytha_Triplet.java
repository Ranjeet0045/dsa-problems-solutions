package Functions;
import java.util.Scanner;

public class Pytha_Triplet {

    static void triplet(int a,int b,int c){
        if(a*a == (b*b + c*c)){
            System.out.print("Pythagorean triplet");
        }
        else if(b*b == (a*a + c*c)){
            System.out.print("Pythagorean triplet");
        }
        else if(c*c == (b*b + a*a)){
            System.out.print("Pythagorean triplet");
        }
        else{
            System.out.print("Not a pythagorean triplet");
        }
    }

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter 3 numbers:");
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            triplet(x,y,z);
        }
    }
}
