class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        int n=words.length;
        StringBuilder sb = new StringBuilder();
        for(String wd : words){
            int s=0;
            for(char ch : wd.toCharArray()){
                int asc = (int)ch;
                s += weights[asc-97];
            }
            s=s%26;
            sb.append((char)(122-s));
        }
        return sb.toString();
    }
}