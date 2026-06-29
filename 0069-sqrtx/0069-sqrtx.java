class Solution {
    public int mySqrt(int x) {
        int ans=0;
        if(x<2)return x;
        int s=0;
        int e=x;
        
        while(s<=e){
            int m = s+(e-s)/2;
            if(m <= x/m){
                ans=m;
                s=m+1;
            }else {
                e=m-1;
            }
        }
        return ans;
    }
}