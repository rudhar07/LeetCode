class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1)return nums[0];
        if(n==2)return Math.max(nums[0],nums[1]);
        int[] dp0 = new int[n-1];
        dp0[0] = nums[1];
        dp0[1] = Math.max(nums[1],nums[2]);
        for(int i=2; i<n-1; i++){
            dp0[i] = Math.max(dp0[i-2]+nums[i+1], dp0[i-1]);
        } 
        int[] dpn = new int[n-1];
        dpn[0] = nums[0];
        dpn[1] = Math.max(nums[0],nums[1]);
        for(int i=2; i<n-1; i++){
            dpn[i] = Math.max(dpn[i-2]+nums[i] , dpn[i-1]);
        }

        return Math.max(dp0[n-2], dpn[n-2]);
        
    }
}