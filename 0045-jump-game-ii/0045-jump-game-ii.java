class Solution {
    public int jump(int[] nums) {
        int n = nums.length;

        int[] dp = new int[n+1];
        dp[0] = dp[1] = 0;


        for(int i=2; i<n+1; i++){
            for(int j=1;j<i; j++){
                if(nums[j-1]>=i-j){
                    dp[i]= Math.min(dp[i] , dp[j]+1);
                    if(dp[i]==0){
                        dp[i]=dp[j]+1;
                    }
                }
            }
        }

        return dp[n];


        
    }
}