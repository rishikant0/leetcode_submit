class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> ans = new Stack<>();
        ans.push(-1); // Base index
        int mx = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                ans.push(i);
            } else {
                ans.pop();
                if (ans.isEmpty()) {
                    ans.push(i); // Reset base
                } else {
                    mx = Math.max(mx, i - ans.peek());
                }
            }
        }
        return mx;
    }
}