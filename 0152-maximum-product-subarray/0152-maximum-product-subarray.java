class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int mn=nums[0];
        int mx=nums[0];
        int ans=nums[0];
        for(int i=1;i<n;i++){
            if(nums[i]<0){
                int temp = mn;
                mn=mx;
                mx=temp;
            }

            mn = Math.min(nums[i], mn*nums[i]);
            mx = Math.max(nums[i], mx*nums[i]);
            ans=Math.max(ans, mx);
        }
        return ans;
    }
}