class Solution {
    public boolean exist(char[][] b, String word) {
        int n=b.length;
        int m=b[0].length;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(search(b, i, j, word, 0))return true;
            }
        }
        return false;
    }
    boolean search(char[][] b, int i, int j, String w, int k){
        int si = w.length();
        if(k==si)return true;

        int n=b.length;
        int m=b[0].length;

        if(i<0 || j<0|| j>=m || i>=n || b[i][j]!=w.charAt(k))return false;
        
        char t = b[i][j];
        b[i][j] = '@';
        boolean u=search(b,i-1,j,w,k+1);
        boolean d=search(b,i+1,j,w,k+1);
        boolean l=search(b,i,j-1,w,k+1);
        boolean r=search(b,i,j+1,w,k+1);
        b[i][j]=t;
        return l || r || d || u;
    }   
}