class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans=0;
        int s=0;
        for(int x:nums){
            if(x==1){
                s++;
                ans=Math.max(s,ans);
            }else{
                s=0;
            }

        }
        return ans;
    }
}