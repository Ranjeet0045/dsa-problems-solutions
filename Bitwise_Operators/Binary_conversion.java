public class Binary_conversion {
    public static void main(String[] args) {
        int num = 15; // Example number
        String binary = Integer.toBinaryString(num); // Convert to binary
        int ans = num & 1;
        
        System.out.println("Original number: " + num);
        System.out.println("Binary representation: " + binary);
        System.out.println("LSB is:" + ans);
    }

}
