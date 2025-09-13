import java.util.Arrays;

public class Divide_String {

    static String[] divideString(String s, int k, char fill) {
        int totalGroups = (s.length() + k - 1) / k;
        String[] arr = new String[totalGroups];

        StringBuilder sb = new StringBuilder(s);

        while (sb.length() % k != 0) {
            sb.append(fill);
        }

        int idx = 0;
        for (int i = 0; i < sb.length(); i += k) {
            arr[idx++] = sb.substring(i, i + k);
        }

        return arr;
    }

    public static void main(String[] args) {
        String s = "abcdefghij";
        int k = 3;
        char fill = 'x';
        String[] ans = divideString(s, k, fill);
        System.out.println(Arrays.toString(ans));  
    }
}
