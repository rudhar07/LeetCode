class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
        for(int num : nums){
            if(mp.containsKey(num)){
                mp.put(num, mp.get(num)+1);
            }else{
                mp.put(num , 1);
            }
        }
        for(int x : mp.keySet()){
            if(mp.get(x)==1)return x;
        }
        return 0;
    }
}