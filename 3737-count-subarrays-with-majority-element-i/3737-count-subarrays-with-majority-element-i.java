class Solution {
    public int countMajoritySubarrays(int[] nums, int t) {
        int n =nums.length;
        int[] pp = new int[n];
        int cnt=0;
        if(nums[0]==t)pp[0]=1;
        for(int i=1;i<n;i++){
            if(nums[i]==t)pp[i]=pp[i-1]+1;
            else pp[i] = pp[i-1];
        }
        if(pp[n-1]==0)return 0;
        for(int i=0;i<n; i++){
            for(int j=0; j<=i; j++){
                int si=i-j+1;
                int tr = pp[i];
                if(j>0)tr -=pp[j-1];

                if(tr>si/2)cnt++;
            }
        }
        return cnt;
    }
}