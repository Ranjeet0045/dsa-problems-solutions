package BackTracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class generate_parentheses {
    public static List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();

        solve(0, new StringBuilder(), list, 2*n);
        List<String> ans = new ArrayList<>();

        for(int i=0; i<list.size(); i++){
            if(isValid(list.get(i))){
                ans.add(list.get(i));
            }
        }

        return ans;
    }
    private static boolean isValid(String str) {
        Stack<Character>stack = new Stack<>();
        
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(ch == '('){
                stack.push(ch);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                stack.pop();
            }
        }

        return stack.isEmpty();
    }
    private static void solve(int i, StringBuilder str, List<String> list, int n) {
        if(i >= n){
            list.add(str.toString());
            return;
        }
        str.append("(");
        solve(i+1, str, list, n);
        str.deleteCharAt(str.length()-1);

        str.append(")");
        solve(i+1, str, list, n);
        str.deleteCharAt(str.length()-1);
    }
    
    public static void main(String[] args) {
        int n = 3;
        System.out.println(generateParenthesis(n));
    }
}
