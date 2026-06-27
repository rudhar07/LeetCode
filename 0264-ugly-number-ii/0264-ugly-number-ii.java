class Solution {
    public int nthUglyNumber(int n) {
        int[] dp = new int[n+1];
        dp[1]=1;
        int n2=2;
        int n3=3;
        int n5=5;
        int i2=1, i3=1, i5=1;
        for(int i=2;i<=n; i++){
            int nextNo = Math.min(n2, Math.min(n3,n5));
            dp[i] = nextNo;
            if(nextNo == n2){
                i2++;
                n2=dp[i2]*2;
            }
            if(nextNo == n3){
                i3++;
                n3=dp[i3]*3;
            }
            if(nextNo == n5){
                i5++;
                n5=dp[i5]*5;
            }
        }
        return dp[n];
    }
}