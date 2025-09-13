public class Split_to_make_Palindrome {

    static boolean checkPalindromeFormation(String a,String b){
        return check(a,b) || check(b,a);
    }

    static boolean check(String a,String b){
        int l = 0,r = b.length()-1;
        while(l<r && a.charAt(l) == b.charAt(r)){
            l++;
            r--;
        }
        if(l>=r) return true;
        return isPalindrome(a.substring(l, r+1)) || isPalindrome(b.substring(l, r+1));
    }

    static boolean isPalindrome(String s){
        int l=0,r=s.length()-1;
        while(l<r && s.charAt(l) == s.charAt(r)){
            l++;
            r--;
        }
        return l>=r;
    }

    public static void main(String[] args) {
        String a = "abdef";
        String b = "fecab";
        boolean ans = checkPalindromeFormation(a,b);
        System.out.println(ans);
    }
}