class Solution {
    public int numOfStrings(String[] p, String word) {
        int cnt=0;
        for(String s : p){
            if(word.contains(s))cnt++;
        }
        return cnt;
    }
}