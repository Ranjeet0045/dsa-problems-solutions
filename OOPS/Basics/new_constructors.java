package Basics;

class Car{
    String name;
    String model;
    int year;

    //Default Constructors
    public Car(){
        name = "Unknown";
        model = "unknown";
        year =  0000;
    }

    //Parameterised Constructors
    public Car(String name,String model,int year){
        this.model = model;
        this.name = name;
        this.year = year;
    }
}

public class new_constructors {
    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println(car1.name);
        System.out.println(car1.model);
        System.out.println(car1.year);

        Car car2 = new Car("Rolls Royce","Alpha++",2025);
        System.out.println(car2.name);
        System.out.println(car2.model);
        System.out.println(car2.year);
    }
}
