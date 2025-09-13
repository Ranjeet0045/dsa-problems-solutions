public class Toggle_ith_bit {
    public static void main(String[] args) {
        int n = 11;
        int pos = 2;
        int bitmask = 1 << pos;
        int newNumber = n ^ bitmask;
        System.out.println(newNumber);
    }
}
