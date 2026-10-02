class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        if(gas.length==0 || cost.length==0) return 0;
        int totalgas=0,totalcost=0;
        for(int i=0;i<cost.length;i++){
            totalgas+=gas[i];
            totalcost+=cost[i];
        }
        if(totalgas<totalcost){
            return -1;
        }
        int currentgas=0,start=0;
        for(int i=0;i<cost.length;i++){
            currentgas+=gas[i]-cost[i];
            if(currentgas<0) {
                currentgas=0;   start=i+1;
            }
        }
        return start;
    }
}