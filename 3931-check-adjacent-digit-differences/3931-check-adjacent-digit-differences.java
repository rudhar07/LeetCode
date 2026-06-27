class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        int n = s.length();
        for(int i=0; i<n-1; i++){
            int c1 = (int)s.charAt(i);
            int c2 = (int)s.charAt(i+1);
            if(Math.abs(c1-c2)>2)return false;
        }
        return true;
    }
}