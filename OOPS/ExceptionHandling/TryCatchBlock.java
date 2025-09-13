package ExceptionHandling;

public class TryCatchBlock {
    public static void main(String[] args) {
        int result = 0;
        int dividend = Integer.parseInt(args[0]);
        int divisor = Integer.parseInt(args[1]);
        try{
            result = dividend / divisor;
        }
        catch(ArithmeticException ae){
            System.out.println("The second command line argument can not be zero....");
        }
        System.out.println("Result = " + result);
    }
}

