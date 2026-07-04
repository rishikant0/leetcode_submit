class Solution {
    public boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) != -1;
    }

    public int maxVowels(String s, int k) {
        int n = s.length();
        int count = 0;

        // Initial window
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) count++;
        }
        int max = count;

        // Sliding window
        for (int i = k; i < n; i++) {
            if (isVowel(s.charAt(i))) count++;
            if (isVowel(s.charAt(i - k))) count--;
            max = Math.max(max, count);
        }

        return max;
    }
}
