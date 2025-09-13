package ExceptionHandling;

class UserDefinedException extends Exception {
    String desc;
    UserDefinedException(String message) {
        super(message);
        desc = message;
    }
    public String toString() {
        return "Custom Exception: " + desc;
    }
 }


public class UserDefinedExceptionDemo {
    public static void main(String[] args) {
        try{
            throw new UserDefinedException("A user defined exception...");
        }
        catch(UserDefinedException ude){
            System.out.println("Exception Object..." + ude);
            System.out.println("Message..." + ude.getMessage());
            System.out.println("STACK TRACE...");
            ude.printStackTrace();
        }   
    }
}
