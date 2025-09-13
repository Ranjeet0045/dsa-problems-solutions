public class Get_ith_bit {
    public static void main(String[] args) {
        int n = 7;
        int pos = 0;
        int bitmask = 1<<pos;
        if((bitmask & n) == 0){
            System.out.println("Bit is zero");
        }
        else{
            System.out.println("Bit is one");
        }
    }
}
