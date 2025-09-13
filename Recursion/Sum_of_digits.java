package Recursion;

public class Sum_of_digits {
    public static void main(String[] args) {
        System.out.println(fun(8615));
    }

    static int fun(int n){
        if(n == 0){
            return 0;
        }
        return (n%10) + fun(n/10);
    }
}