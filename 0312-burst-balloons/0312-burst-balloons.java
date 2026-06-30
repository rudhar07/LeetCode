class Solution {
    public int maxCoins(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n+2];
        arr[0]=1;
        arr[n+1]=1;
        for(int i=0; i<n; i++){
            arr[i+1] = nums[i];
        }
        int[][] t = new int[n+2][n+2];
        for(int i=0; i<n+2; i++){
            Arrays.fill(t[i], -1);
        }

        return bb(arr, 1, n+1, t);
        
    }
    public static int bb(int[] a, int i, int j, int[][] t){
        if(i>j)return 0;
        if(t[i][j]!=-1)return t[i][j];

        int ans = 0;
        for(int k=i; k<j; k++){
            int cur = bb(a, i, k, t) + bb(a, k+1, j, t) + (a[i-1]*a[k]*a[j]);

            ans = Math.max(ans, cur);
        }
        return t[i][j]=ans;

    }
}