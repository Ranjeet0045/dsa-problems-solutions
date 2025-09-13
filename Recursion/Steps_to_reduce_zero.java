package Recursion;

public class Steps_to_reduce_zero {

    static int numberOfSteps(int n){
        int steps = 0;
        if(n == 0){
            return steps;
        }
        if(n%2 == 0){
            n = n/2;
            steps++;
        }
        else if(n%2 != 0){
            n = n-1;
            steps++;
        }
        return steps + numberOfSteps(n);
    }

    public static void main(String[] args) {
        int num = 123;
        System.out.println(numberOfSteps(num));
    }
}
