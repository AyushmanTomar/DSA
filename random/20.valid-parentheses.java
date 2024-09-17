/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */

// @lc code=start
import java.util.*;

class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 == 1) {
            return false;
        }

        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            }
            else if(stack.isEmpty()&&(ch == ')' || ch == ']' || ch == '}'))
            {
                return false;
            }
            else if (ch == ')' || ch == ']' || ch == '}') {
                if (!stack.isEmpty()) {
                    char ch1 = stack.peek();
                    if (ch == map.get(ch1)) {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }
        }
        if (stack.isEmpty())
            return true;
        return false;
    }
}
// @lc code=end
