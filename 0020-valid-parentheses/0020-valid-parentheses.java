import java.util.*;

class Solution {
    public boolean isValid(String s) {

        Stack<Character> st1 = new Stack<>();

        for(char c : s.toCharArray()) {

            if(c == '{' || c == '[' || c == '(') {
                st1.push(c);
            }
            else {

                if(st1.isEmpty()) return false;

                char temp = st1.pop();

                if(c == '}' && temp != '{') return false;
                if(c == ']' && temp != '[') return false;
                if(c == ')' && temp != '(') return false;
            }
        }

        return st1.isEmpty();
    }
}