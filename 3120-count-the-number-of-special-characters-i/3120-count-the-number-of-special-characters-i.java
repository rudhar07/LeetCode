class Solution {
    public int numberOfSpecialChars(String word) {
        int n = word.length();
        if(n==1)return 0;
        HashSet<Integer> h = new HashSet<>();
        int ans=0;
        for(char ch : word.toCharArray()){
            h.add((int)ch);
        }
        for(int i=65;i<91; i++){
            if(h.contains(i)&&h.contains(i+32))ans++;
        }
        return ans;
    }
}