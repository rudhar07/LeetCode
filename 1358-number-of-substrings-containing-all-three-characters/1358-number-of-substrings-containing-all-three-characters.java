class Solution {
    public int numberOfSubstrings(String s) {
        int a=-1;
        int b=-1;
        int c=-1;
        int n = s.length();
        int mn=Integer.MAX_VALUE;
        int tot=0;
        for(int i=0; i<n; i++){
            char ch=s.charAt(i);

            if(ch=='a')a=i;
            else if(ch=='b')b=i;
            else c=i;

            mn=Math.min(a, Math.min(b,c));

            if(a>-1 && b>-1 && c>-1){
                tot += (1+mn);
            }
            
        }
        return tot;
    }
}