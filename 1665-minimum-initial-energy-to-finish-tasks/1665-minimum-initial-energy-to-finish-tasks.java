class Solution {
    public int minimumEffort(int[][] tasks) {
        int n =tasks.length;
        Arrays.sort(tasks, (a,b) -> Integer.compare(b[1]-b[0] , a[1]-a[0]));

        int mini=0;
        int cur=0;
        int ans=0;
        for(int i=0; i<n; i++){
            mini = tasks[i][1];

            if(cur<mini){
                int need = mini-cur;
                cur+=need;
                ans+=need;
            }
            cur-=tasks[i][0];
        }
        return ans;


        
    }
}