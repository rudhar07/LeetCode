class Solution {
public:
    bool isPalindrome(int x) {
        int n = x;
        long long a = 0;
        if(x<0)return false;
        while(n>0){
            int dig = n%10;
            a = a * 10 + dig;
            n=n/10;
        }

        if(x==a){
            return true;
        }
        return false;
        
    }
};