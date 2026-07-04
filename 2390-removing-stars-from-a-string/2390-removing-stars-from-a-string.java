import java.util.*;

class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*') {
                if (!st.isEmpty()) st.pop();
            } else {
                st.push(s.charAt(i));
            }
        }

        // Build result string
        StringBuilder result = new StringBuilder();
        for (char c : st) {
            result.append(c);
        }
        return result.toString();
    }
}
