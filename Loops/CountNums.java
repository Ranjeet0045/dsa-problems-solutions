package Loops;

public class CountNums {
    public static void main(String[] args){
        int n=455827;
        int count=0;
        while(n>0){
            int rem=n%10;
            if(rem==5){
                count=count+1;
            }
            n=n/10;
        }
        System.out.println("No. of times 5 present is:" + count);
    }
}
