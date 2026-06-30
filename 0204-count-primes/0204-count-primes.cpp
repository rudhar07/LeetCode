class Solution {
public:
    int countPrimes(int n) {
        vector<bool> p(n,1);
        if(n<=2)return 0;
        p[0]=p[1]=0;
        for(int i=2; i*i<n; i++){
            if(p[i]){
                for(int j=i*i; j<n; j+=i){
                    p[j]=0;
                }
            }
        }
        int cnt=0;
        for(int x:p){
            if(x)cnt++;
        }
        return cnt;

    }
};