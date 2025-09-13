package ExceptionHandling;

public class DivideByZero {
    public static void main(String[] args) {
        System.out.println("Start");
        int ans = 5 / 0;       // Exception occurs here....
        System.out.println(ans);
        System.out.println("End");  // This line will never run....
    }
}
