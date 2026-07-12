class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n=arr.length;
        int[] d = new int[n];
        for(int i=0;i<n;i++){
            d[i]=arr[i];
        }
        Arrays.sort(d);
        HashMap<Integer,Integer> m = new HashMap<>();
        int tem=0;
        for(int i=0;i<n;i++){
            if(!m.containsKey(d[i])){
                m.put(d[i], i+1+tem);
            }else{
                tem--;
            }
        }

        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            ans[i] = m.get(arr[i]);
        }
        return ans;
    }
}