package Functions;

public class Passing_String {

    public static void main(String[] args) {
        String x = greet("Hello Everyone");
        System.out.print("Greeting : " + x);
    }

    static String greet(String name){
        String message = name;
        return message;
    }
}
