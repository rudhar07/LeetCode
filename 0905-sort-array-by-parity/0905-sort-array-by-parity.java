class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n=nums.length;
        int od=0;
        int ev=0;
        for(int x:nums){
            if(x%2==0)ev++;
            else od++;
        }
        if(od==n || ev==n || n==1)return nums;
        int i=0;
        int j=1;
        while(j<n){
            if(nums[i]%2==0){
                i++;
                j++;
            }else{
                if(nums[j]%2==0){
                    int tem=nums[i];
                    nums[i]=nums[j];
                    nums[j]=tem;
                    i++;
                    j++;
                }else{
                    j++;
                }
            }
        }
        return nums;
    }
}