class Solution {
    boolean fl;
    int[] vis;
    public boolean canReach(int[] arr, int start) {
        int n = arr.length;
        fl=false;
        vis=new int[n+1];
        trav(arr, start);
        return fl;
    }
    void trav(int[] a, int i){
        int n=a.length;
        if(a[i]==0){
            fl=true;
            return;
        }
        if(vis[i]==1)return;

        vis[i]=1;
        int l = i-a[i];
        int r = i+a[i];
        if(l>=0 && l<n)trav(a, l);
        if(r>=0 && r<n)trav(a, r);
    }
}