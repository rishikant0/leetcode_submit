class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration,
                                  int[] waterStartTime, int[] waterDuration) {
        int n = landStartTime.length;
        int m = waterStartTime.length;
        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int finishLand = Math.max(landStartTime[i], 0) + landDuration[i];
                int finishBoth1 = Math.max(finishLand, waterStartTime[j]) + waterDuration[j];

                int finishWater = Math.max(waterStartTime[j], 0) + waterDuration[j];
                int finishBoth2 = Math.max(finishWater, landStartTime[i]) + landDuration[i];

                ans = Math.min(ans, Math.min(finishBoth1, finishBoth2));
            }
        }
        return ans;
    }
}
