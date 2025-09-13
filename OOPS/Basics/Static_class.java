package Basics;

public class Static_class {

    public static void Hello(){
        System.out.println("Hi, Everyone");
        Static_class obj = new Static_class();
        obj.dance();
    }

    public static void main(String[] args) {
        Hello();
    }

    public void dance(){
        System.out.println("I am dancing");
    }
}
