class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int s=0;
        int e=n-1;
        while(s<e){
            int m = s+(e-s)/2;
            if(nums[s]<nums[e])return nums[s];

            if(nums[m]>nums[s] || nums[m]>nums[e])s=m+1;
            else if(nums[m]<nums[e] || nums[m]<nums[s])e=m;
            else {
                s++; 
                e--;
            }
        }
        return nums[s];
        
    }
}