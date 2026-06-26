class Solution {
    public String reverseWords(String s) {
        String[] a = s.trim().split("\\s+");
        int n = a.length;
        StringBuilder ans= new StringBuilder();
        for(int i=n-1; i>0; i--){
            ans.append(a[i]);
            ans.append(" ");
        }
        ans.append(a[0]);
        return ans.toString();
    }
}