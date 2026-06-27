class Solution {
    int[] dp;
    int n; 
    public boolean canReach(String s, int minJump, int maxJump) {
        n = s.length();
        int p=0;
        dp = new int[n];
        dp[0]=1;
        for(int i=1; i<n; i++){
            if(i >= minJump && dp[i-minJump]==1)p++;
            if(i > maxJump && dp[i-maxJump-1]==1)p--;
            if(p>0 && s.charAt(i)=='0'){
                dp[i]=1;
            }
        }
        return dp[n-1]==0 ? false : true;
    }
    
}