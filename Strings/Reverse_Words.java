
public class Reverse_Words {

    static String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=s.length()-1; i>=0; ){
            if(s.charAt(i) == ' '){
                i--;
                continue;
            }
            StringBuilder temp = new StringBuilder();
            int j=i;
            while(j >= 0 && s.charAt(j) != ' '){
                temp.append(s.charAt(j));
                j--;
                i--;
            }
            sb.append(temp.reverse());
            sb.append(' ');
            
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
            String str = "the sky is blue";
            String ans = reverseWords(str);
            System.out.println(ans);
    }
}
