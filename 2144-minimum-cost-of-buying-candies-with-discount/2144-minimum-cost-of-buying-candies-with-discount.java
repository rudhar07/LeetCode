class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int n=cost.length;
        int tcost=0;
        int fl=0;
        for(int i=n-1;i>=0;i--){
            if(fl==2){
                fl=0;
                continue;
            }
            tcost+=cost[i];
            fl++;
        }
        return tcost;
    }
}