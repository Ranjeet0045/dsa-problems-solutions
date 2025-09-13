package JavaFeatures;

@FunctionalInterface
interface MyFunctionalInterface {
    void myMethod();  
}

public class LambdaExpression {
    public static void main(String[] args) {

        //Lambda expression to implement the functional interface
        MyFunctionalInterface instance = () -> {System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
    };

        //Calling the method
        instance.myMethod();
    }
}
