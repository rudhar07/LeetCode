class Solution {
public:
    bool judgeCircle(string moves) {
        int n=moves.size();
        int u=0;
        int r=0;
        for(int i=0; i<n; i++){
            if(moves[i]=='U')u++;
            else if(moves[i]=='D')u--;
            else if(moves[i]=='R')r++;
            else r--;
        }
        if(r==0 && u==0)return true;
        return false;

    }
};