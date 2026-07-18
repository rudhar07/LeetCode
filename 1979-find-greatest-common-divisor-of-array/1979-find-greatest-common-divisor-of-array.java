class Solution {
    public int findGCD(int[] nums) {
        int mx=0;
        int mn=1001;
        for(int i=0;i<nums.length; i++){
            mx = Math.max(mx, nums[i]);
            mn = Math.min(mn, nums[i]);
        }
        return gcd(mx, mn);
    }
    int gcd(int a, int b){
        if(b==0)return a;
        return gcd(b, a%b);
    }
}