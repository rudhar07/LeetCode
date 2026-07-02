class Solution {
    int[][] vis;
    boolean[][] dp;

    int n;
    int m;
    public boolean findSafeWalk(List<List<Integer>> grid, int h) {
        n = grid.size();
        m = grid.get(0).size();
        vis = new int[n][m];
        for (int[] row : vis) {
            Arrays.fill(row, -1);
        }
        dp = new boolean[n][m];
        

        bfs(grid, 0, 0, h);

        return dp[n-1][m-1];
    }
    void bfs(List<List<Integer>> g, int i, int j, int h){
        if(i<0 || j<0 || i>=n || j>=m)return;

        if(g.get(i).get(j)==1)h--;

        if(h<=0)return;

        if(vis[i][j] >= h)return;

        vis[i][j]=h;

        dp[i][j]=true;

        bfs(g, i+1, j, h);
        bfs(g, i-1, j, h);
        bfs(g, i, j+1, h);
        bfs(g, i, j-1, h);
    }
}