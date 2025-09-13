public class Valid_Palindrome_2 {

    static boolean isPalindrome(String s, int i , int j){
        while(i < j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;
    }

    static boolean validPalindrome(String s){

        int i = 0;
        int j = s.length()-1;
        while(i < j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }
            else{
                return isPalindrome(s,i+1,j) || isPalindrome(s,i,j-1); 
            }
        }
        return true;

        //  Brute Force -> Time Limit Exceeded
       
        // StringBuilder sb = new StringBuilder(s);
        // if(sb.length() == 0 || sb.length() == 1){
        //     return true;
        // }
        // int i = 0;
        // while(i < sb.length()){
        //     char removed = sb.charAt(i);    
        //     sb.deleteCharAt(i);
        //     int j = 0;
        //     int k = sb.length()-1;
        //     boolean ans = true;
        //     while(j<=k){
        //         if(sb.charAt(j) != sb.charAt(k)){
        //             ans = false;
        //             break;
        //         }
        //         j++;
        //         k--;
        //     }
        //     sb.insert(i,removed);
        //     if(ans == true){
        //         return ans;
                
        //     }
        //     i++;
        // }
        // return false;

        // Optimised

       
    }

    public static void main(String[] args) {
        String s = "abca";
        boolean ans = validPalindrome(s);
        System.out.println(ans);
    }
}
