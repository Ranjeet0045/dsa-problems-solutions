package Functions;

public class Function_Overloading {
    
    public static void main(String[] args) {
        fun("Ranjeet");
        fun(6);
    }

    //When two or more functions have same name then
    //it is called function overloading
    static void fun(int a){
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println(name);
    }
}
