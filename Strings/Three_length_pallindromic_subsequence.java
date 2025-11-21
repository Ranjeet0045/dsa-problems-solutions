import java.util.*;

public class Three_length_pallindromic_subsequence {

    //Approach - 1

    public static int countPalindromicSubsequence_1(String s) {
        int count = 0;
        char[] ch = s.toCharArray();
        Set<Character> set = new HashSet<>();

        for(int i=0; i<ch.length; i++){
            set.add(ch[i]);
        }

        for(char letter : set){
            int left_idx = -1;
            int right_idx = -1;

            for(int i=0; i<ch.length; i++){
                if(ch[i] == letter){
                    if(left_idx == -1){
                        left_idx = i;
                    }
                    right_idx = i;
                }
            }

            if (left_idx == -1 || right_idx == -1 || left_idx == right_idx) {
                continue;
            }
            
            Set<Character> st = new HashSet<>();
            for(int middle = left_idx+1; middle < right_idx; middle++){
                st.add(ch[middle]);
            }
            count += st.size();
        }

        return count;
    }

    //Approach - 2

    public static int countPalindromicSubsequence_2(String s){
        int n = s.length();
        int[] first = new int[26];
        int[] last = new int[26];

        for (int i = 0; i < 26; i++) {
            first[i] = n;
            last[i] = -1;
        }

        for (int i = 0; i < n; i++) {
            int c = s.charAt(i) - 'a';
            first[c] = Math.min(first[c], i);
            last[c] = i;
        }

        int count = 0;
        for (int c = 0; c < 26; c++) {
            if (first[c] < last[c]) {

                Set<Character> mid = new HashSet<>();

                for (int i = first[c] + 1; i < last[c]; i++) {
                    mid.add(s.charAt(i));
                }

                count += mid.size();
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String s = "aabca";
        int ans1 = countPalindromicSubsequence_1(s);
        System.out.println(ans1);

        int ans2 = countPalindromicSubsequence_2(s);
        System.out.println(ans2);
    }
}
