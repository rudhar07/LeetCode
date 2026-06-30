class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0];
        int sell=-1;
        int pr = 0;

        int n = prices.length;
        for(int i=1; i<n; i++){
            if(prices[i]<buy){
                buy=prices[i];
                sell=-1;
            }else{
                if(prices[i]>sell){
                    sell=prices[i];
                    pr=Math.max(pr,sell-buy);
                }else{
                    pr = Math.max(pr,sell-buy);
                }
            }
        }
    
        return pr;
    }
}