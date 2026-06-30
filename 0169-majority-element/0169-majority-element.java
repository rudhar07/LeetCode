class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
        for(int num : nums){
            if(mp.containsKey(num)){
                mp.put(num, mp.get(num)+1);
            }else{
                mp.put(num , 1);
            }
        }
        int ans =0;
        int mf=0;
        for(int x : mp.keySet()){
            if(mp.get(x)>mf){
                ans=x;
                mf = mp.get(x);
            }
        }
        return ans;
    }
}