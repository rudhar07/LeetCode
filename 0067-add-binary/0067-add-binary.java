class Solution {
    public String addBinary(String a, String b) {
        int n = a.length();
        int m = b.length();
        StringBuilder ans = new StringBuilder();
        int carry = 0;
        int i=n-1, j=m-1;
        while(i>=0 || j>=0 || carry==1){
            int sum = carry;
            if(i>=0)sum += a.charAt(i) - '0';
            if(j>=0)sum += b.charAt(j) - '0';
            i--; j--;
            ans.append(sum%2);
            carry = sum/2;
        }
        return ans.reverse().toString();


        
    }
}