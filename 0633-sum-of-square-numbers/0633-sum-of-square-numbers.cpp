class Solution {
public:
    bool judgeSquareSum(int c) {
        long l = 0;
        long r = sqrt(c);
        while(l<=r){
            long s = l*l + r*r;
            if(s==c)return true;
            if(s<c)l++;
            else r--;

        }
        return false;
        
    }
};