class Solution {
    public int maxJumps(int[] arr, int d) {
        int n = arr.length;
        int[] dp=new int[n];
        Arrays.fill(dp, -1);
        int ans=1;
        for(int i=0; i<n; i++){
            ans= Math.max(ans, dfs(i, arr, d, dp));
        }
        return ans;
    }
    int dfs(int i, int[] a, int d, int[] dp){
        int n=a.length;
        int ans=1;
        if(dp[i]!=-1)return dp[i];
        for(int j=i+1; j<=Math.min(n-1, i+d); j++){
            if(a[j]>=a[i])break;

            ans= Math.max(ans, 1+dfs(j, a,d,dp));
        }
        for(int j=i-1; j>=Math.max(0, i-d); j--){
            if(a[j]>=a[i])break;

            ans= Math.max(ans, 1+dfs(j, a,d,dp));
        }
        return dp[i]=ans;
    }
}