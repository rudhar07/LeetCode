class Solution {
    public boolean isGood(int[] nums) {
        int n = nums.length;
        int l = 0;
        Arrays.sort(nums);
        for(int i=0; i<n-1; i++){
            if(nums[i] == i+1)l++;
        }
        if(nums[n-1]==n-1)l++;
        if(l==n)return true;
        return false;
    }
}