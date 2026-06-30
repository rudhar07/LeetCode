class Solution {
    public String reverseVowels(String s) {
        int l=0;
        int r=s.length()-1;
        HashSet<Character> h = new HashSet<>();
        Collections.addAll(h, 'a','e','i','o','u','A','E','I','O','U');
        char[] str = s.toCharArray();
        while(l<r){
            char f = s.charAt(l);
            char b = s.charAt(r);
            if(h.contains(f) && h.contains(b)){
                char t = f;
                str[l] = b;
                str[r] = t;
                l++;
                r--;
            }else if(h.contains(f)){
                r--;
            }else if(h.contains(b)){
                l++;
            }else{
                l++; r--;
            }
        }
        return new String(str);
    }
}