class Solution {
    public boolean escapeGhosts(int[][] ghosts, int[] t) {
        int dist = Math.abs(t[0])+Math.abs(t[1]);
        for(int[] g : ghosts){
            if(dist >= Math.abs(g[0]-t[0])+Math.abs(g[1]-t[1]))return false;
        }
        return true;
    }
}