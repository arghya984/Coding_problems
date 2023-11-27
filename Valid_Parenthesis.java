/*Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

        An input string is valid if:

        1.Open brackets must be closed by the same type of brackets.
        2.Open brackets must be closed in the correct order.
        3.Every close bracket has a corresponding open bracket of the same type.


        Example 1:

        Input: s = "()"
        Output: true
        Example 2:

        Input: s = "()[]{}"
        Output: true
        Example 3:

        Input: s = "(]"
        Output: false*/

import java.util.Stack;
public class Valid_Parenthesis {
    public static void main(String[] args) {
        String S="[";
        System.out.println(isValid(S));
    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    char c = stack.pop();
                    if ((s.charAt(i) == ')' && c == '(') || (s.charAt(i) == '}' && c == '{') || (s.charAt(i) == ']' && c == '[')) {
                        continue;
                    } else {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}
