class Solution {
    public boolean sumGame(String num) {
        int n = num.length();
        int sumL = 0, sumR = 0;
        int qL = 0, qR = 0;

        for (int i = 0; i < n / 2; i++) {
            char c = num.charAt(i);
            if (c == '?') qL++;
            else sumL += c - '0';
        }

        for (int i = n / 2; i < n; i++) {
            char c = num.charAt(i);
            if (c == '?') qR++;
            else sumR += c - '0';
        }

        double balance = (qR - qL) * 9 / 2.0; 
        return (sumL - sumR) != balance;
    }
}
