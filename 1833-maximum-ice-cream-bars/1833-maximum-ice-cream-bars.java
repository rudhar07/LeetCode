class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int n =costs.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=costs[i];
            if(sum==coins)return i+1;
            if(sum>coins)return i;
        }
        return n;
        
    }
}