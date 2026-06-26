class Solution {
    public char processStr(String s, long k) {
        int n = s.length();
        long[] len = new long[n+1];
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            long cur = len[i];

            if(ch == '*'){
                len[i+1] = Math.max(0L, cur-1);
            }else if(ch == '#'){
                len[i+1] = cur*2;
            }else if(ch == '%'){
                len[i+1] = cur;
            }else{
                len[i+1] = cur+1;
            }
        }
        if(k<0 || k>=len[n])return '.';

        for(int i=n-1; i>=0; i--){
            char ch = s.charAt(i);
            long prev = len[i];
            long cur = len[i+1];

            if(ch >= 'a' && ch<='z'){
                if(k==prev)return ch;
            }else if(ch == '#'){
                k%=prev;
            }else if(ch == '%'){
                k = prev-k-1;
            }
        }
        return '.';
    }
}