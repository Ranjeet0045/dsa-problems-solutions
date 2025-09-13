package Basics;
public class Constructor {
    public static void main(String[] args) {
        
        Student Anushri = new Student(0, null, 0);
        Student MyLove = new Student();
        Anushri.name = "Riya";
        System.out.println(Anushri.name); 
        System.out.println(MyLove.name);
    }
}

class Student {

    int rno;
    String name;
    float marks;

    Student() {
        this(13,"Bhavna",99.67f);
    }

    Student(int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
}
