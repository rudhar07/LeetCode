class Solution {
    public long gcdSum(int[] nums) {
        int mx=0;
        for(int i=0;i<nums.length; i++){
            mx = Math.max(mx, nums[i]);
            nums[i] = gcd(nums[i], mx);
        }

        Arrays.sort(nums);

        long sum=0;

        for(int i=0;i<nums.length/2; i++){
            sum += gcd(nums[i], nums[nums.length-1-i]);
        }
        return sum;
    }
    int gcd(int a, int b){
        if(b==0)return a;
        return gcd(b, a%b);
    }
}