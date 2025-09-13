package Abstract_Class;

public class Main {
    public static void main(String[] args) {
        Son son = new Son();
        son.career("Prakhar");

        Daughter daughter = new Daughter();
        daughter.career("Priyanka");

        Parent.hello();
        son.normal();
    }
}
