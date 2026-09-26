class Solution {
    public int maxProfit(int[] prices) {
        int s =prices[0];
        int f =prices[0];
        int r =0;
        for(int i=1;i<prices.length;i++){
             if(s > prices[i]){
                s = prices[i];
                f =s;
             }else if(f < prices[i]){
                f = prices[i];
               r = Math.max(r,f-s);
             }
        }
        r = Math.max(r,f-s);
        return r;
    }
}