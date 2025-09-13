package Inheritence;

public class Main {
    public static void main(String[] args) {
        Box side = new Box(4);
        System.out.println(side.l + " "  + side.h + " " + side.w);

        BoxWeight box1 = new BoxWeight();
        System.out.println(box1.weight + " " + box1.l + " " + box1.w);
    }
}
