public class Longest_pallindromic_Substring {
    static String longestPalindrome(String s) {
        String str = "babad";
        int i = 0;
        int j = s.length()-1;
        int count1 = 0;
        int count2 = 0;
        while(i<=j){
            if(s.charAt(i) == s.charAt(j)){
                count1++;
                count2++;
            }
            else{
                count1 = 0;
                count2 = 0;
            }
            i++;
            j--;
        }
        int st = count1;
        int ed = s.length() - count2;
        for(int k = st; k<ed; k++){
            System.out.print(s.charAt(k));
        }
        System.out.println();
        return str;
    }
    public static void main(String[] args) {
        String str = "babad";
        String ans = longestPalindrome(str);
        System.out.println(ans);
    }
}
