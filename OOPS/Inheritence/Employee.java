package Inheritence;

class Salary{
    String name = "Amit Shanker Pandey";
    float salary = 40000;
}

//Inheriting property of Salary in Bonus class
class Bonus extends Salary{
    int bonus = 10000;
}

public class Employee {
    public static void main(String[] args) {
        Bonus first = new Bonus();
        System.out.println(first.name);
        System.out.println(first.bonus);
        System.out.println(first.salary);

        Salary second = new Salary();
        System.out.println(second.name);
    }
}
