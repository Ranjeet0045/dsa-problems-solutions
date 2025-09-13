import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Vowels_game {

    public static boolean helper(String str){
        Set<Character> set = new HashSet<>(Arrays.asList('a','e','i','o','u'));
        int count = 0;
        for(int i=0; i<str.length(); i++){
            if(set.contains(str.charAt(i))){
                count++;
            }
        }
        if(count == 0) return false;
        if(count % 2 != 0) return true;
        return true;
        
    }

    public static void main(String[] args) {
        String s = "leetcoder";
        boolean ans = helper(s);
        System.out.println(ans);
    }
}
