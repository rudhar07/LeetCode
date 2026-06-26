class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int mxLen=1;
        int[] le=new int[n];
        Arrays.fill(le, 1);

        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]){
                    if(le[j]+1 > le[i]){
                        le[i]=le[j]+1;
                    }
                }
            }
            mxLen = Math.max(mxLen, le[i]);
        }
        
        return mxLen;
    }
}