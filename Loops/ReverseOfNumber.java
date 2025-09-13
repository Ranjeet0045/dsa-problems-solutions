package Loops;

public class ReverseOfNumber {
    public static void main(String[] args){
        int num=67547;
        int rev=0,rem;
        for(int i=1;i<=num;i++){
            rem=num % 10;
            rev=rem + rev*10;
            num=num/10;
        }
        System.out.println("Reverse of digits are:" + rev);
    }
}
