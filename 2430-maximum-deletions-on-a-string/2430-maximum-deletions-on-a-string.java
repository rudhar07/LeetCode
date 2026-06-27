class Solution {
    public int deleteString(String s) {
        int n = s.length();
        int[] dp = new int[n+1];
        dp[n]=0;
        for(int i=n-1; i>=0; i--){
            dp[i] = 1; // deleting krdena ek baar mei , whole at once
            String subs = s.substring(i);
            int[] z = calZ(subs.toCharArray());
            int sn = subs.length();
            for(int k=1; k<=sn/2; k++){
                if(z[k] >= k){
                    dp[i] = Math.max(dp[i], 1+dp[i+k]);
                }
            }
        }
        return dp[0];
    }
    int[] calZ(char[] a){
        int n = a.length;
        int[] z = new int[n]; 
        int left=0; 
        int right=0; 
        for(int k=1; k<n; k++){ 
            if(k>right){ 
                left=right=k; 
                while(right<n && a[right] == a[right-left])right++; 
                z[k] = right-left; 
                right--; 
            }else{ 
                int k1 = k - left; 
                if(z[k1] < right-k+1){ 
                    z[k] = z[k1]; 
                }else{ 
                    left=k; 
                    while(right<n && a[right] == a[right-left])right++; 
                    z[k] = right-left; 
                    right--; 
                } 
            } 
        } 
        return z; 
    }
}