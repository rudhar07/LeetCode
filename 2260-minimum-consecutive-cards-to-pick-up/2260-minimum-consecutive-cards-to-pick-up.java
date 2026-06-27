class Solution {
    public int minimumCardPickup(int[] cards) {
        HashMap<Integer, int[]> m = new HashMap<>();
        int ans=Integer.MAX_VALUE;
        int n=cards.length;
        for(int i=0; i<n; i++){
            if(m.containsKey(cards[i])){
                ans = Math.min(ans, i-m.get(cards[i])[1]+1 );
                m.put(cards[i], new int[]{m.get(cards[i])[0]+1, i});
            }else{
                m.put(cards[i], new int[]{1, i});
            }
        }
        if(m.size()==n)return -1;
        return ans;
    }
}