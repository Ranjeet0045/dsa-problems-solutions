// LEETCODE -> 2131

public class Longest_pallindrome {

    //  COPIED FROM CHATGPT 

     static String longestPalindrome(String[] words) {
        boolean[] used = new boolean[words.length];
        StringBuilder sbFront = new StringBuilder();
        StringBuilder sbBack = new StringBuilder();
        String center = "";

        for (int i = 0; i < words.length; i++) {
            if (used[i]) continue;

            for (int j = i + 1; j < words.length; j++) {
                if (used[j]) continue;

                // Palindromic pair (like "ab" + "ba")
                if (words[i].equals(new StringBuilder(words[j]).reverse().toString())) {
                    sbFront.append(words[i]);
                    sbBack.insert(0, words[j]);
                    used[i] = used[j] = true;
                    break;
                }
            }
        }

        // Look for a single palindromic word to place in the center (like "gg")
        for (int i = 0; i < words.length; i++) {
            if (!used[i] && words[i].charAt(0) == words[i].charAt(1)) {
                center = words[i];
                break;  // Only one allowed in the center
            }
        }
        int length = (sbFront.toString() + center + sbBack.toString()).length();
        System.out.println("Length of pallindromic string formed is: " + length);
        System.out.print("Formed string is: ");
        return sbFront.toString() + center + sbBack.toString();
    }


    // MY LOGIC BUT THERE IS ERROR IN THIS


    // static String longestPalindrome(String[] words) {
    //     StringBuilder sb = new StringBuilder();
    //     for (int i = 0; i < words.length; i++) {
    //         for (int j = i+1; j < words.length; j++) {
    //             StringBuilder temp = new StringBuilder();
    //             temp.append(words[i]);
    //             if(temp.charAt(0) == temp.charAt(1)){
    //                 if(words[i].equals(words[j])){
    //                     sb.insert(0,words[i]);
    //                     sb.append(words[j]);
    //                 }
    //                 else{
    //                     sb.insert(sb.length()/2,words[i]);
    //                 }
    //                 temp.delete(0, 2);
    //             }
    //             else{
    //                 String reversed = new StringBuilder(words[j]).reverse().toString();
    //                 if(words[i].equals(reversed)){
    //                 sb.insert(0,words[i]);
    //                 sb.append(words[j]);
    //             } 
    //             } 
    //         }
    //     }
    //     return new  String(sb);
    // }

    public static void main(String[] args) {
        String[] words = {"ab","ty","yt","lc","cl","ab"};
        String ans = longestPalindrome(words);
        System.out.println(ans);
    }
}
