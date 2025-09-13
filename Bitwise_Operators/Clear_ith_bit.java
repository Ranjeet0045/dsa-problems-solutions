public class Clear_ith_bit {
    // ith bit will be converted to zero 
    public static void main(String[] args) {
        int n = 5;
        int pos = 2;
        int bitmask = 1<<pos; // Creating bitmask 0001 -> 0100
        int temp = ~bitmask;  // Taking complement of bitmask
        int newNumber = temp & n;  // Doing & operation of original number and bitmask to clear ith bit
        System.out.println(newNumber);
    }
}
