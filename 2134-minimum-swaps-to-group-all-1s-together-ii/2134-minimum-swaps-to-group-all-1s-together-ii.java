class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        int[] arr = new int[2*n];
        int o=0;
        for(int i=0;i<n;i++){
            if(nums[i]==1)o++;
        }
        for(int i=0;i<2*n; i++){
            arr[i] = nums[i%n];
        }
        int ans;
        int sum=0;
        for(int i=0;i<o;i++){
            sum += arr[i];
        }
        ans=o-sum;
        for(int i=o; i<2*n; i++){
            sum -= arr[i-o];
            sum += arr[i];
            ans= Math.min(ans, o-sum);
        }
        return ans;

    }
}