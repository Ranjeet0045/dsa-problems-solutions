package Dynamic_programming.Memorization;

import java.util.ArrayList;
import java.util.List;

public class generate_parentheses {

    // Approach-1
    public static List<String> generateParenthesis1(int n) {
        List<String> list = new ArrayList<>();
        solve(0, "", list, 2*n);

        List<String> ans = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (isValid(list.get(i))) {
                ans.add(list.get(i));
            }
        }
        return ans;
    }
    private static boolean isValid(String str) {
        int count = 0;
        
        for(int i=0; i<str.length(); i++){
            if(count < 0) return false;
            if(str.charAt(i) == '(') count++;
            else count --;
        }
        return count == 0;
    }
    private static void solve(int i, String curr, List<String> list, int n) {
        if(i == n){
            list.add(curr);
            return;
        }

        solve(i+1, curr+"(", list, n);
        solve(i+1, curr+")", list, n);
    }

    //Approach-2
    public static List<String> generateParenthesis2(int n) {
        List<String> list = new ArrayList<>();
        solve(0, "", list, 2*n);

        List<String> ans = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (isValid(list.get(i))) {
                ans.add(list.get(i));
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 3;
        System.out.println(generateParenthesis1(n));
        System.out.println(generateParenthesis2(n));
    }
}
