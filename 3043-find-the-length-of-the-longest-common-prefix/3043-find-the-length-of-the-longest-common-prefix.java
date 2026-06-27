class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        HashSet<Integer> h = new HashSet<Integer>();
        for(int x: arr1){
            while(x>0){
                h.add(x);
                x/=10;
            }
        }
        int maxLen = 0;
        for(int x : arr2){
            while(x>0){
                if(h.contains(x)){
                    String str = Integer.toString(x);
                    maxLen = Math.max(maxLen, str.length());
                    break;
                }
                x/=10;
            }
        }
        return maxLen;
    }
}