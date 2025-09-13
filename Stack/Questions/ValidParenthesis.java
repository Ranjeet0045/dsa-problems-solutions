package Stack.Questions;

import java.util.Stack;

public class ValidParenthesis {

    static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                stack.push(s.charAt(i));
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.peek();
                if((top == '(' && s.charAt(i) == ')') ||
                    (top == '{' && s.charAt(i) == '}') ||
                    (top == '[' && s.charAt(i) == ']')) {
                        stack.pop();
                    }
                else{
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String str = "([)]";
        boolean ans = isValid(str);
        System.out.println(ans);
    }
}
