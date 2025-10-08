package Hashmap;

import java.util.Collections;
import java.util.HashMap;

public class SumOf_Beauty_of_substrings {

    public static int beautySum(String s) {
        int sum = 0;

        // Generate all substrings (i to j)
        for (int i = 0; i < s.length(); i++) {
            HashMap<Character, Integer> map = new HashMap<>();

            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);
                map.put(ch, map.getOrDefault(ch, 0) + 1);

                // Each time we extend the substring, compute its beauty
                int maxValue = Collections.max(map.values());
                int minValue = Collections.min(map.values());

                sum += maxValue - minValue;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        String s = "aabcb";
        int ans = beautySum(s);
        System.out.println(ans);
    }
}
