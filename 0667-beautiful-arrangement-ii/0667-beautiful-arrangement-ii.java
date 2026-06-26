class Solution {
    public int[] constructArray(int n, int k) {
        int[] ans = new int[n];
        int l=1;
        int r=n;
        int cnt=0;
        for(int i=0; l<=r && i<n; i++){
            if(cnt>=k){
                if(k%2==0){
                    ans[i]=r--;
                }else{
                    ans[i]=l++;
                }
            }else{
                if(cnt%2==0){
                    ans[i]=l++;
                }else{
                    ans[i]=r--;
                }
                cnt++;
            } 
        }
        return ans;
    }
}