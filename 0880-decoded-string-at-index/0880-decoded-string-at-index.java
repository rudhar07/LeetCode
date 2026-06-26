class Solution {
    public String decodeAtIndex(String s, int k) {
        int n = s.length();
        long[] len = new long[n+1];
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch>='a' && ch<='z'){
                len[i+1] = len[i] + 1;
            }else{
                int num = ch-'0';
                len[i+1] = len[i] * num;
            }
        }

        for(int i=n-1; i>=0; i--){
            char ch = s.charAt(i);
            long prev = len[i];
            long cur = len[i+1];
            k%=cur;
            if(ch>='a' && ch<='z'){
                if(k == 0)return ""+ch;
            }else{
                int num = ch-'0';
                k%=prev;
            }
        }
        return ""+s.charAt(0);
        
    }
}