public class Valid_Palindrome {

    static boolean isPalindrome(String s){
        boolean ans = true;
        String pld = s.toLowerCase();
        System.out.println(pld);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < pld.length(); i++) {
            char j = 'a';
            int k = 0;
            while(j <= 'z' || k <= 9) {
                char c = pld.charAt(i);
                if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) {
                    sb.append(c);
                    break;
                }
                j++;
                k++;
            }
        }
        System.out.println(sb);
        int i = 0;
        int j = sb.length()-1;
        while(i<=j){
            if(sb.charAt(i) != sb.charAt(j)){
                ans = false;
            }
            i++;
            j--;
        }
        return ans;
    }

    public static void main(String[] args) {
        // String s =  "A man, a plan, a canal: Panama";
        String s = "race a car";
        boolean ans = isPalindrome(s);
        System.out.println(ans);
    }
}
