class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<int[]> p = new PriorityQueue<>((a, b) -> 
            {
                if(a[0]==b[0])return a[1]-b[1];
                return a[0] - b[0];
            }
        );
        int row = mat.length;
        int col = mat[0].length;
        for(int i=0;i<row;i++){
            int s=0;
            for(int x : mat[i]){
                s+=x;
            }
            p.add(new int[]{s, i});
        }
        int[] ans = new int[k];
        int ind=0;
        while(ind<k){
            int[] arr=p.poll();
            ans[ind++]= arr[1];
        }
        return ans;
    }
}