class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int ans=0;
        int rep=0;
        HashMap<Character, Integer> m=new HashMap<>();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(m.containsKey(ch) && m.get(ch)>=rep){
                rep=m.get(ch)+1;
            }
            m.put(ch, i);
            ans = Math.max(ans, i-rep+1);
        }
        if(m.size()==n)return n;
        return ans;
    }
}