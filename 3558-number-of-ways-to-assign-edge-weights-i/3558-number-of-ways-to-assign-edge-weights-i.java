class Solution {
    final int mod = 1000000007;

    public int assignEdgeWeights(int[][] edges) {
        int n = edges.length;

        if(n==1)return 1;

        HashMap<Integer, ArrayList<Integer>> m = new HashMap<>();
        for(int[] e : edges){
            if(m.containsKey(e[0])){
                m.get(e[0]).add(e[1]);
            }else{
                ArrayList<Integer> l = new ArrayList<>();
                l.add(e[1]);
                m.put(e[0] , l);
            }

            if(m.containsKey(e[1])){
                m.get(e[1]).add(e[0]);
            }else{
                ArrayList<Integer> l = new ArrayList<>();
                l.add(e[0]);
                m.put(e[1] , l);
            }


        }
        int ans = dfs(1, -1, m);
        return (int)modPow(2, ans-1);
        
    }
    public int dfs(int node, int prev, HashMap<Integer, ArrayList<Integer>> m){
        int d=0;
        for(int ch : m.get(node)){
            if(ch !=prev){
               d = Math.max(d, 1 + dfs(ch, node, m));
            }
        }
        return d;
    }
    long modPow(long base, long exp){
        long res=1;
        while(exp>0){
            if((exp&1)==1){
                res = (res*base)%mod;
            }
            base = (base*base)%mod;
            exp >>=1;

        }
        return res;
    }
    
}