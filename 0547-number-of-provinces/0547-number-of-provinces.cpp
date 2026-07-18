class Solution {
public:
    int findCircleNum(vector<vector<int>>& isConnected) {
        int n = isConnected.size();
        vector<int> vis(n,0);
        int cnt=0;
        for(int i=0; i<n; i++){
            if(!vis[i]){
                dfs(i, isConnected, vis);
                cnt++;
            }
        }
        return cnt;
    }
    void dfs(int node, vector<vector<int>>& m, vector<int>& vis){
        vis[node]=1;
        for(int i=0; i<m.size(); i++){
            if(m[node][i]==1 && !vis[i]){
                dfs(i, m, vis);
            }
        }
    }
};