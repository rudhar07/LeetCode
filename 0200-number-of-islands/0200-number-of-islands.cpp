class Solution {
public:
    int numIslands(vector<vector<char>>& grid) {
        int n = grid.size();
        int m = grid[0].size();
        int cnt=0;
        for(int i=0; i <n; i++){
            for(int j=0; j<m; j++){
                if(grid[i][j]=='1'){
                    dfs(grid,i,j);
                    cnt++;
                }
            }
        }
        return cnt;
    }
    void dfs(vector<vector<char>>& g, int i, int j){
        int n = g.size();
        int m = g[0].size();
        if(i<0 || j<0 || i>=n || j>=m || g[i][j]=='0')return;

        g[i][j]='0';
        dfs(g, i+1, j);
        dfs(g, i-1, j);
        dfs(g, i, j+1);
        dfs(g, i, j-1);
    }
};