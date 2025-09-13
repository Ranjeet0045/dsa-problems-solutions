public class Reverse_Word {

    static String reverseWords(String s){
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        // for (int i = 0; i < words.length; i++) {
        //     String rev = new StringBuilder(words[i]).reverse().toString();
        //     sb.append(rev);
        //     sb.append(" ");
        // }
        for (int i = 0; i < words.length; i++) {
            char[] arr = words[i].toCharArray();
            int j = 0;
            int k = arr.length-1;
            while(j <= k){
                char temp = arr[j];
                arr[j] = arr[k];
                arr[k] = temp;
                j++;
                k--;
            }
            sb.append(arr);
            sb.append(" "); 
        }
        
        return new String(sb).trim();
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        String ans = reverseWords(s);
        System.out.println(ans);
    }
}
