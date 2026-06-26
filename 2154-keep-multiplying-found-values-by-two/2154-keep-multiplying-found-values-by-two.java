class Solution {
    public int findFinalValue(int[] nums, int original) {
        HashSet<Integer> set = new HashSet<>();
        for (int x : nums) {
            set.add(x);
        }
        long c=original;
        while(set.contains((int)c)){
            c*=2;
        }
        return (int)c;
    }
}