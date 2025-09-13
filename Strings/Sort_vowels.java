import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.List;

public class Sort_vowels {

    public static String sortVowels(String str) {
        Set<Character> vowels = new HashSet<>(Arrays.asList(
            'a','e','i','o','u','A','E','I','O','U'
        ));

        List<Character> list = new ArrayList<>();
        for (char c : str.toCharArray()) {
            if (vowels.contains(c)) {
                list.add(c);
            }
        }

        Collections.sort(list);

        StringBuilder sb = new StringBuilder(str);
        int idx = 0;
        for (int i = 0; i < sb.length(); i++) {
            if (vowels.contains(sb.charAt(i))) {
                sb.setCharAt(i, list.get(idx++));
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "lEetcOde";
        String ans = sortVowels(s);
        System.out.println(ans);  // lEOtcede
    }
}
