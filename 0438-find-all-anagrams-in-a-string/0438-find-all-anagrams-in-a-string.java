class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int pl = p.length();
        int tl = s.length();
        ArrayList<Integer> ans = new ArrayList<>();
        if(pl>tl)return  ans;
        int[] fs=new int[26];
        int[] fp=new int[26];
        for(int i=0;i<pl;i++){
            fp[p.charAt(i)-'a']++;
            fs[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(fs, fp))ans.add(0);
        for(int i=pl; i<tl; i++){
            fs[s.charAt(i-pl)-'a']--;
            fs[s.charAt(i)-'a']++;
            if(Arrays.equals(fs,fp))ans.add(i-pl+1);
        }
        return ans;
    }
}