public class Reverse_bits {
    public static void main(String[] args) {
        int n = 43261596;
        String nums = Integer.toBinaryString(n);
        char[] arr = nums.toCharArray();
        int i = 0;
        int j = arr.length-1;
        while(i <= j){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        String ans = new String(arr);
        int result = Integer.parseInt(ans, 2);
        System.out.println(result);
    }
}