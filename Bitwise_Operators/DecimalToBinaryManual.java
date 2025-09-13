
public class DecimalToBinaryManual {
    public static void main(String[] args) {
        int decimal = 25; // Input decimal number
        String binary = "";

        // Keep dividing the number by 2 and storing the remainder
        while (decimal > 0) {
            int remainder = decimal % 2;
            binary = remainder + binary; // Append to the left side
            decimal /= 2; // Reduce the number
        }

        System.out.println("Binary representation: " + binary);
    }
}