class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> l = new ArrayList<>();
        for(String w : words){
            if(mat(w, pattern))l.add(w);
        }
        return l;
    }
    boolean mat(String wd, String p){
        HashMap<Character,Character> m = new HashMap<>();
        HashMap<Character,Character> h = new HashMap<>();

        for(int i=0;i<wd.length();i++){
            char wc = wd.charAt(i);
            char pc = p.charAt(i);

            if(m.containsKey(wc)){
                if(pc!=m.get(wc))return false;
            }else{
                m.put(wc,pc);
            }


            if(h.containsKey(pc)){
                if(wc!=h.get(pc))return false;
            }else{
                h.put(pc,wc);
            }
        }

        return true;
    }
}