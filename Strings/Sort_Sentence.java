
public class Sort_Sentence {

    static String sortSentence(String s){
        String[] words = s.split(" ");
        String[] ans = new String[words.length];
        for(String word : words){
            int n = word.length();
            // int pos = word.charAt(n-1) - 48;
            int pos = Character.getNumericValue(word.charAt(n-1));
            ans[pos - 1] = word.substring(0,n-1);
        }
        StringBuilder sb = new StringBuilder();
        for(String word : ans){
            sb.append(word);
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        String ans = sortSentence(s);
        System.out.println(ans);
    }
}
