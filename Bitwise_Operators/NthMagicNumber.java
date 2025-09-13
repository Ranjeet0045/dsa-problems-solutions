public class NthMagicNumber {
    static int find(int n) {
        int ans = 0;
        int base = 5;
        while(n > 0){
            int last = (n & 1);
            n = (n >> 1);
            ans = ans + (last*base);
            base = (base*5);
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(n +"th Magic Number is: " + find(n));
    }
}