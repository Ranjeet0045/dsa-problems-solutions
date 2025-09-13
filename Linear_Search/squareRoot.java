package Linear_Search;

// import java.util.Scanner;

public class squareRoot {
    //Using binary search method to solve this problem
    static int sqrt(int num){
        if(num == 0 || num == 1){
            return num;
        }
        int low = 0;
        int high = num;
        while(low <= high){
            int mid = (low + high) / 2;
            int midsquared = (mid * mid);
            if(midsquared == num){
                return mid;
            }
            else if(midsquared < num){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return high;
    }

    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        // System.out.print("Enter a number : ");
        // int num = in.nextInt();
        int num = 36;
        System.out.println("Integer Square Root of given number is : " + sqrt(num));
        // in.close();
    }
}
