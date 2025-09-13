package Binary_Search;

import java.util.Scanner;

public class SquareRootOfaNumber {

    static int sqrt(int num){
        if(num == 0 || num == 1){
            return num;
        }
        int start = 1;
        int end = num;
        while(start <= end){
            int mid = start + (end - start)/2;
            if((mid * mid) == num){
                return mid;
            }
            if((mid*mid) > num){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return end;
    }

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Enter a number : ");
            int num = in.nextInt();
            int ans = sqrt(num);
            System.out.println("Integer Square root of given number is : " + ans);
        }
    }
}
