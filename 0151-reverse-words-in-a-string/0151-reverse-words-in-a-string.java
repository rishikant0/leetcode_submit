class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        s = sb.toString();

        StringBuilder ans = new StringBuilder();
        int n = s.length();

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == ' ') continue;

            StringBuilder word = new StringBuilder();

            while (i < n && s.charAt(i) != ' ') {
                word.append(s.charAt(i));
                i++;
            }

            ans.append(word.reverse()).append(" ");
        }

        return ans.toString().trim();
    }
}
