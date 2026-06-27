class Solution {
    HashMap<Long, Integer> s;
    public int maximumLength(int[] nums) {
        int n = nums.length;
        s = new HashMap<>();
        int o=0;
        for(int x:nums){
            if(x==1)o++;

            s.put((long)x, s.getOrDefault((long)x,0)+1);
        }
        int ans=0;
        if(o%2==0)ans=o-1;
        else ans=o;

        int cur=0;
        for(int i=0;i<n;i++){
            if(nums[i]>1){
                cur = pwpw(nums[i]);
            }
            ans = Math.max(ans, cur);
        }
        return ans;
    }
    int pwpw(long n){
        if(!s.containsKey(n))return 0;
        if(s.get(n)<2)return 1;

        if (n > 1_000_000_000L) return 1;
        long sq = n*n;
        if(s.containsKey(sq)){
            return 2 + pwpw(sq);
        }
        return 1;
    }
}