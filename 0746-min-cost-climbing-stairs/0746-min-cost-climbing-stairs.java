class Solution {
    public int minCostClimbing(int[] cost, int idx ,int[] dp){
        if(idx <=1) return cost[idx];
        if(dp[idx] != -1) return dp[idx];
        return dp[idx] = cost[idx] + Math.min(minCostClimbing(cost,idx-1,dp), minCostClimbing(cost,idx-2,dp));
    }
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n];
        Arrays.fill(dp, -1);
      return   Math.min(minCostClimbing(cost,n-1,dp), minCostClimbing(cost,n-2,dp));
    }
}