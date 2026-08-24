class Solution {
    public int stoneGameVII(int[] stones) {
        int n = stones.length;
        int[] prefix = new int[n+1];
        for (int i = 0; i < n; i++) {
            prefix[i+1] = prefix[i] + stones[i];
        }

        int[][] dp = new int[n][n];

        for (int len = 2; len <= n; len++) {
            for (int l = 0; l + len - 1 < n; l++) {
                int r = l + len - 1;
                int sumLeftRemoved = prefix[r+1] - prefix[l+1]; // sum(l+1..r)
                int sumRightRemoved = prefix[r] - prefix[l];   // sum(l..r-1)
                dp[l][r] = Math.max(sumLeftRemoved - dp[l+1][r],
                                    sumRightRemoved - dp[l][r-1]);
            }
        }

        return dp[0][n-1];
    }
}
