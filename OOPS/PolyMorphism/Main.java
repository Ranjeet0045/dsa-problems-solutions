package PolyMorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Square square = new Square();
        Triangle triangle = new Triangle();
        Circle circle = new Circle();

        shape.area();
        square.area();
        triangle.area();
        circle.area();

        square.color();
    }
}
