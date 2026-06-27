class Solution {
    public String stringHash(String s, int k) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<=n-k; i+=k){
            int sum=0;
            for(int j=i; j<i+k; j++){
                char ch = s.charAt(j);
                sum += (ch-'a');
            }
            sum=sum%26;
            sb.append((char)(sum+97));
        }
        return sb.toString();
    }
}