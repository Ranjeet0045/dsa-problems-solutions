public class Binary_Decimal_Conversion {
    
    public static void main(String[] args) {
        String binary = "11001"; // Input binary number
        int decimal = 0;
        int power = 0;

        // Traverse the binary string from right to left
        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                decimal += Math.pow(2, power);
            }
            power++;
        }

        System.out.println("Decimal representation: " + decimal);
    }
}

