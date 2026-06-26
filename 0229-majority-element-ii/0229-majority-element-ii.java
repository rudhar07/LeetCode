class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        int th = n/3;
        HashMap<Integer, Integer> h = new HashMap<>();
        for(int i=0;i<n;i++){
            h.put(nums[i] , h.getOrDefault(nums[i], 0)+1);
        }
        List<Integer> l = new ArrayList<>();
        for(int k : h.keySet()){
            if(h.get(k)>th)l.add(k);
        }
        return l;
    }
}