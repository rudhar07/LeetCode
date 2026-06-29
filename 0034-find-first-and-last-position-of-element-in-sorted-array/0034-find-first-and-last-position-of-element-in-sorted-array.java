class Solution {
    public int[] searchRange(int[] nums, int target) {

        int[] ans = new int[2];
        ans[0] = -1;
        ans[1] = -1;
        int n = nums.length;
        int s=0;
        int e=n-1;
        ans[0] = left(nums,s,e,target);
        if(ans[0]==-1)return ans;
        ans[1] = right(nums,s,e,target);
        
        return ans;
    }

    public int left(int[] a,int s,int e,int t){
        int ans = -1;
        while(s<=e){
            int mid = s+(e-s)/2;

            if(a[mid]==t){
                ans = mid;
                e=mid-1;
            }else if(a[mid]< t){
                s=mid+1;
            }else{
                e=mid-1;
            }
        }

        return ans;

    }
    public int right(int[] a,int s,int e,int t){
        int ans = -1;
        while(s<=e){
            int mid = s+(e-s)/2;

            if(a[mid]==t){
                ans = mid;
                s=mid+1;
            }else if(a[mid]< t){
                s=mid+1;
            }else{
                e=mid-1;
            }
        }

        return ans;

    }
}