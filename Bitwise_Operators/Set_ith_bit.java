public class Set_ith_bit {
    public static void main(String[] args) {
        int n = 5; //  0101
        int pos = 3;
        int bitmask = 1 << pos;
        int newNumber = bitmask | n;
        System.out.println(newNumber);
    }
}
