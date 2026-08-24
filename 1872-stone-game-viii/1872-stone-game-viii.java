class Solution {
    public int stoneGameVIII(int[] stones) {
        int n = stones.length;
        int[] prex = new int[n];
        prex[0] = stones[0];
        for(int i = 1 ;i< n ;i++){
            prex[i] = prex[i-1] + stones[i];
        }

        int dp = prex[n - 1];
        
        for(int i = n-2;i >=1 ; i--){
            dp = Math.max(dp,prex[i] - dp);

        }

        return dp;
    }
}