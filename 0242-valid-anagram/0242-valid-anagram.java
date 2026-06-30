class Solution {
    public boolean isAnagram(String s, String t) {
        int n=s.length();
        int m=t.length();
        if(n!=m)return false;
        int[] fs = new int[26];
        int[] ft = new int[26];
        for(int i=0;i<n;i++){
            fs[s.charAt(i)-'a']++;
            ft[t.charAt(i)-'a']++;
        }
        if(Arrays.equals(fs,ft))return true;
        return false;
    }
}