class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int z=0;
        int l=0;
        int mxLen=0;
        for(int r=0; r<n; r++){
            if(nums[r]==0)z++;

            while(z>k){
                if(nums[l]==0)z--;
                l++;
            }
            mxLen=Math.max(mxLen, r-l+1);
        }
        return mxLen;
    }
}