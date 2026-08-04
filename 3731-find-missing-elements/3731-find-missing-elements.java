class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n=nums.length;
        List<Integer> li = new ArrayList<Integer>();
        Arrays.sort(nums);
        for(int i=1; i<n; i++){
            for(int j=nums[i-1]+1; j<nums[i]; j++)li.add(j);
        }
        return li;
    }
}