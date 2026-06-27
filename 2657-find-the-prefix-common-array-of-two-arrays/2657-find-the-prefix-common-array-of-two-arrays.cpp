class Solution {
public:
    vector<int> findThePrefixCommonArray(vector<int>& A, vector<int>& B) {
        int n = A.size();
        vector<int> ans(n);
        vector<bool> seen(n+1);
        int cnt=0;
        for(int k=0; k<n; k++){
            if(seen[A[k]])cnt++;
            else  seen[A[k]]=true;

            if(seen[B[k]])cnt++;
            else seen[B[k]]=true;
            ans[k]=cnt;
        }
        return ans;
    }
};