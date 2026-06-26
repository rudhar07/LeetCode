class Solution {
    public int countMatchingSubarrays(int[] nums, int[] p) {
        int n = nums.length;
        int m = p.length;
        int cnt=0;
        int ind=0;
        for(int i=0;i<n-m;i++){
            ind = i;
            boolean tr=true;
            for(int j=0;j<m;j++){
                if(p[j]==0){
                    if(nums[ind]!=nums[ind+1]){
                        tr=false;
                        break;

                    }else{
                        ind++;
                    }
                }else if(p[j]==1){
                    if(nums[ind]>=nums[ind+1]){
                        tr=false;
                        break;
                    }else{
                        ind++;
                    }
                }else{
                    if(nums[ind]<=nums[ind+1]){
                        tr=false;
                        break;
                    }else{
                        ind++;
                    }
                }
            }
            if(tr)cnt++;
        }
        return cnt;
    }
}