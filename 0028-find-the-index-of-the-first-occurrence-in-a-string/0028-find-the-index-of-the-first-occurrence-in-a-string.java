class Solution {
    public int strStr(String haystack, String needle) {
        int tl = haystack.length();
        int pl = needle.length();

        for(int i=0; i<=tl-pl; i++){
            if(haystack.substring(i,i+pl).equals(needle)){
                return i;
            }
        }
        return -1;

    }
}