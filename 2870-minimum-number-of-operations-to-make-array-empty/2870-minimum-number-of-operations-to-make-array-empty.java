class Solution {
    public int minOperations(int[] t) {
        HashMap<Integer, Integer> m = new HashMap<>();
        int n=t.length;
        int cnt=0;
        for(int i=0;i<n;i++){
            m.put(t[i] , m.getOrDefault(t[i], 0)+1);
        }
        for(int k : m.keySet()){
            int v = m.get(k);
            if(v==1)return -1;
            else if(v%3==0)cnt+=v/3;
            else cnt+=(v/3 +1);
        }
        return cnt;
    }
}