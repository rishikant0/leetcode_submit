class Solution {
    public int maxsum(int nums[],int idx,int[] dp){
      
        if(idx>=nums.length) return 0;
       
        if(dp[idx]!=-1) return dp[idx];
        // hera pick the idx ka number then call tha function and hera also check after second inx and store in dp 
        int steal =nums[idx]+maxsum(nums,idx+2,dp);
        // yaha pr skpi kijiya number ko or us number ko dp ma store kijiya
        int skip =maxsum(nums,idx+1,dp);
        // finally retrurn kr dijiya jo max hai dona ma 
        return dp[idx]=Math.max(steal,skip);
    }
    public int rob(int[] nums) {
        // idx --> 0 to n-1
        int[] dp = new int[nums.length];
        // its fill in all index -1 before assign any number
        Arrays.fill(dp,-1);
        // call function ,hera pass nums ,idx and dp array
        return maxsum(nums,0,dp);
    }
}