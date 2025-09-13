public class Negative_of_Number {

    static int result(int n){
        int ans = ~n + 1;
        return ans;
    }

    public static void main(String[] args) {
        int n = 15;
        System.out.println(result(n));
    }
}
