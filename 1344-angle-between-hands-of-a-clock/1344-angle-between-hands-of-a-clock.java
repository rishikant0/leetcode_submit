class Solution {
    public double angleClock(int hour, int minutes) {
        double HA = hour*30 + minutes*0.5;
        double MA = minutes*6;
        double diff = Math.abs(HA - MA);
        return Math.min(diff , (360 - diff));
        
    }
}