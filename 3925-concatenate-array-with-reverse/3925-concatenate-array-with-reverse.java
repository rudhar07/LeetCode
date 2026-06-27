class Solution {
    public int[] concatWithReverse(int[] nums) {
        int n = nums.length;
        int[] res=new int[2*n];
        int ind=0;
        for(int x:nums){
            res[ind++]=x;
        }
        for(int i=n-1; i>=0; i--){
            res[ind++]=nums[i];
        }
        return res;
    }
}