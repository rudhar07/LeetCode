class Solution {
    public int removeCoveredIntervals(int[][] in) {
        int n = in.length;
        int t=0;
        Arrays.sort(in, (a,b) -> 
            a[0]==b[0] ? b[1]-a[1] : a[0]-b[0]
        );

        int mxEnd=0;
        for(int[] inr : in){
            if(inr[1] > mxEnd){
                t++;
                mxEnd = inr[1];
            }
        }
        return t;
    }
}