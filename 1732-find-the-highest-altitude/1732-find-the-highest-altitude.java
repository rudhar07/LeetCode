class Solution {
    public int largestAltitude(int[] g) {
        int n=g.length;
        int[] p = new int[n];
        int ha=0;
        p[0]=g[0];
        ha=Math.max(ha, p[0]);
        for(int i=1;i<n;i++){
            p[i]=p[i-1]+g[i];
            ha=Math.max(ha, p[i]);
        }
        return ha;
    }
}