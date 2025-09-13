public class To_LowerCase {

    static String toLowerCase(String s){

    // StringBuilder result = new StringBuilder();
    // for (int i = 0; i < s.length(); i++) {
    //     char ch = s.charAt(i);
    //     if (ch >= 'A' && ch <= 'Z') {
    //         ch = (char) (ch + 32);
    //     }
    //     result.append(ch);
    // }
    // return result.toString();

        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            int x = s.charAt(i);
            if(x >= 65 && x <= 90){
                x = x + 32;
                char v = (char)x;
                sb.setCharAt(i, v);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "HeLlo";
        String ans = toLowerCase(s);
        System.out.println(ans);
    }
}
