package Inheritence;

public class Box {
    double l;
    double h;
    double w;

    Box () {
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }

    Box (double side) {
        this.h = side;
        this.l = side;
        this.w = side;
    }

    Box (double h, double l, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }
}