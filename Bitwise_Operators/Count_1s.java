public class Count_1s {
    public static void main(String[] args) {
        int n = 9;
        int count = 0;
        String binary = Integer.toBinaryString(n);
        System.out.println(binary);
        int i = 0;
        while(i < binary.length()){
            if(binary.charAt(i) == '1'){
                count++;
            }
            i++;
        }
        System.out.println(count);
    }
}
