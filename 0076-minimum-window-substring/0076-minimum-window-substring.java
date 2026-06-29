class Solution {
    public String minWindow(String A, String B) {
        int pl=B.length();
        int tl=A.length();
        if(pl>tl)return "";
        int[] f = new int[128];
        for(char c : B.toCharArray()){
            f[c]++;
        }
        int l=0;
        int r=0;
        int minLen=Integer.MAX_VALUE;
        int st=0;
        int cnt=pl;
        while(r<tl){
            char ch = A.charAt(r);
            if(f[ch]>0){
                cnt--;
            }
            f[ch]--;
            r++;
            while(cnt == 0){
                if(r-l < minLen){
                    minLen=r-l;
                    st=l;
                }
                char tem = A.charAt(l);
                f[tem]++;
                if(f[tem]>0){
                    cnt++;
                }
                l++;
            }
        }
        return minLen==Integer.MAX_VALUE ? "" : A.substring(st, st+minLen);
    }
}