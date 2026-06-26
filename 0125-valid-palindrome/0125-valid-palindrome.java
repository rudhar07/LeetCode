class Solution {
    public boolean isPalindrome(String s) {
        String l = s.replaceAll("[^a-zA-Z0-9]", "");
        l = l.toLowerCase();
        String str = new StringBuilder(l).reverse().toString();

        if(str.equals(l))return true;
        return false;
    }
}