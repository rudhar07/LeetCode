class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer, Integer> m=new HashMap<>();
        m.put(0,1);
        int s=0;
        int cnt=0;
        for(int x : nums){
            s+=x;
            if(m.containsKey(s-goal))cnt+=m.get(s-goal);
            m.put(s, m.getOrDefault(s,0) + 1);
        }
        return cnt;
    }
}