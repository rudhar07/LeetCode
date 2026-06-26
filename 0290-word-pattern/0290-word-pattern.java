class Solution {
    public boolean wordPattern(String pattern, String s) {
        int n = pattern.length();
        String[] w = s.split("\\s+");
        int si = w.length;
        if(n!=si)return false;
        HashMap<Character, String> m = new HashMap<>();
        HashMap<String , Character> h = new HashMap<>();
        for(int i=0;i<n;i++){
            char ch = pattern.charAt(i);
            String wd = w[i];
            if(m.containsKey(ch)){
                if(!wd.equals(m.get(ch)))return false;
            }else{
                m.put(ch, wd);

            }


            if(h.containsKey(wd)){
                if(ch!=(h.get(wd)))return false;
            }else{
                h.put(wd, ch);

            }
        }
        return true;
    }
}