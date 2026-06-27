class Solution {
    public int minElement(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            int tem = nums[i];
            int s=0;
            while(tem>0){
                int rem=tem%10;
                s+=rem;
                tem/=10;
            }
            nums[i]=s;
        }
        int mn=Integer.MAX_VALUE;
        for(int x:nums){
            mn=Math.min(mn, x);
        }
        return mn;

    }
}