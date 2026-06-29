class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
        int n = nums.length;
        int[] ans = new int[2];
        for(int i=0; i<n; i++){
            int com = target - nums[i];

            if(mp.containsKey(com)){
                ans[0] = mp.get(com);
                ans[1] = i;
                break;
            }
            mp.put(nums[i], i);
        }
        return ans;
    }
}