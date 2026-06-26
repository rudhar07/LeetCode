class Solution {
    public int minimumLevels(int[] p) {
        int n=p.length;
        int s=0;
        for(int i=0;i<n;i++){
            if(p[i]==0)p[i]=-1;
            s+=p[i];
        }
        int cnt=0;
        int sum2=0;
        for(int x:p){
            cnt++;
            sum2+=x;
            if(sum2 > s-sum2)break;
        }
        if(cnt<n)return cnt;
        return -1;
    }
}