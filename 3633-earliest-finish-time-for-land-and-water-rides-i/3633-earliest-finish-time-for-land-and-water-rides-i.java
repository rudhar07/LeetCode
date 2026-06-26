class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int n = landStartTime.length; // land ki len
        int m = waterStartTime.length; // water ki len
        int res=4000;
        int minL = 4000;
        int minW = 4000;
        for(int i=0;i<n;i++){
            minL = Math.min(minL, landStartTime[i] + landDuration[i]);
        }
        for(int i=0;i<m;i++){
            minW = Math.min(minW, waterStartTime[i] + waterDuration[i]);
            res = Math.min(res , Math.max(minL, waterStartTime[i]) + waterDuration[i]);
        }
        for(int i=0;i<n;i++){
            res = Math.min(res, Math.max(minW, landStartTime[i])+landDuration[i]);
        }
        return res;
    }
}