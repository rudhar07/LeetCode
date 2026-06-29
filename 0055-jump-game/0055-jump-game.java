class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        boolean[] dp = new boolean[n+1];
        dp[0]=dp[1]=true;
        if(nums[0]==0)return dp[n];
        for(int i=1; i<n+1; i++){
            int jn=nums[i-1];
            // if(jn==0)continue;
            if(!dp[i])continue;
            for(int j=i+1; j<i+1+jn; j++){
                if(j<n+1)dp[j]=true;
            }
        }
        return dp[n];
        
    }
}