package Functions;

import java.util.Scanner;

public class Area_Circumference {
      public static void main(String[] args) {
          try (Scanner in = new Scanner(System.in)) {
              System.out.print("Enter radius:");
              int radius = in.nextInt();
              float x = circle(radius);
              System.out.print(x);
          }
    }

    static int circle(int radius){
       float area = (float)(3.14*radius*radius);
       System.out.println("Area is : " + area);
       float circumference = (float)(2*3.14*radius);
       System.out.println("Circumference is : " + circumference);
       return 0;
    }
}
