class Solution {
    public int[] divisibilityArray(String word, int m) {
        int n=word.length();
        int[] ans = new int[n];
        long rem=0;
        for(int i=0;i<n;i++){
            int dig = word.charAt(i)-'0';
            rem = (rem*10 + dig)%m;
            if(rem==0)ans[i]=1;
        }
        return ans;
    }
}