class Solution {
    public int minMoves(int[] nums, int limit) {
        int n = nums.length;
        int[] sm = new int[2*limit + 2];

        for(int i=0; i<n/2; i++){
            int a = nums[i];
            int b = nums[n-1-i];

            int low = Math.min(a,b) + 1;
            int high = Math.max(a,b) + limit;
            int sum = a+b;

            sm[2] += 2;
            sm[low] -=1;
            sm[sum] -=1;
            sm[sum+1]+=1;
            sm[high+1]+=1;
        }
        int ans = Integer.MAX_VALUE;
        int cur =0;
        for(int i=2; i<=2*limit; i++){
            cur+=sm[i];
            ans = Math.min(ans,cur);
        }
        return ans;
        
    }
}