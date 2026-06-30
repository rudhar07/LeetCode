class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs = new HashSet<Integer>();
        HashSet<Integer> ans = new HashSet<Integer>();
        for( int num : nums1){
            hs.add(num);
        }
        for(int num : nums2){
            if(hs.contains(num)){
                ans.add(num);
            }
        }
        int si = ans.size();
        int[] an = new int[si];
        int k=0;
        for(int x:ans){
            an[k] = x;
            k++;
        }
        return an;
    }
}