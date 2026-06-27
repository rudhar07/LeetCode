class Solution {
    public int numberOfSpecialChars(String word) {
        int ans=0;
        int n=word.length();
        HashMap<Integer, Integer> m = new HashMap<>();
        for(int i=0;i<n;i++){
            char ch = word.charAt(i);
            int asc = (int)ch;
            if(asc>96){
                if(m.containsKey(asc)){
                    m.put(asc, i);
                }
            }
            if(!m.containsKey(asc)){
                m.put(asc , i);
            }
        }
        for(int i=65;i<91;i++){
            if(m.containsKey(i) && m.containsKey(i+32) && m.get(i)>m.get(i+32)){
                ans++;
            }
        }
        return ans;
    }
}