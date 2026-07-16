class Solution {

    public int maxdis(int i, int j , StringBuilder a ,StringBuilder b, int[][] dp){
        if (i == -1) return j + 1; // need to insert remaining chars of b
        if (j == -1) return i + 1; // need to delete remaining chars of a

        if (dp[i][j] != -1) return dp[i][j];

        if (a.charAt(i) == b.charAt(j)) {
            return dp[i][j] = maxdis(i - 1, j - 1, a, b, dp);
        } else {
            int del = maxdis(i - 1, j, a, b, dp);     // delete
            int ins = maxdis(i, j - 1, a, b, dp);     // insert
            int rep = maxdis(i - 1, j - 1, a, b, dp); // replace

            return dp[i][j] = 1 + Math.min(del, Math.min(ins, rep));
        }
    
    }
    public int minDistance(String word1, String word2) {
          StringBuilder a = new StringBuilder(word1);
        StringBuilder b = new StringBuilder(word2);

        int m = a.length(), n = b.length();
        int[][] dp = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }

        return maxdis(m - 1, n - 1, a, b, dp);
    
    }
}