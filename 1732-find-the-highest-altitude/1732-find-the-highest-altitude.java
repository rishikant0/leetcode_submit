class Solution {
    public int largestAltitude(int[] gain) {
        int count =0;
       int max = Integer.MIN_VALUE;
       max = Math.max(max,count);
        for(int i=0;i<gain.length;i++){
            count += gain[i];
             max = Math.max(max,count);
        }
        return max;
    }
}