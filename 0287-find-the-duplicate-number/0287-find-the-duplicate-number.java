class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
        for(int i=0; i<n; i++){
            if(m.containsKey(nums[i])){
                return nums[i];
                
            }
            m.put(nums[i], 1);
            
        }
        
        return -1;

    }
}