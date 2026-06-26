class Solution {
    public int minJumps(int[] arr) {
        int n=arr.length;
        if(n==1)return 0;
        HashMap<Integer, ArrayList<Integer>> mp = new HashMap<>();
        for(int i=0; i<n; i++){
            if(mp.containsKey(arr[i])){
                mp.get(arr[i]).add(i);
            }else{
                ArrayList<Integer> l = new ArrayList<>();
                l.add(i);
                mp.put(arr[i],l);
             }
        }
        boolean[] vis=new boolean[n];
        vis[0]=true;
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0, 0});

        while (!q.isEmpty()) {
            int[] curr = q.poll();
            int node = curr[0];
            int dist = curr[1];

            if (node == n - 1) return dist;

            if (node - 1 >= 0 && !vis[node - 1]) {
                vis[node - 1] = true;
                q.offer(new int[]{node - 1, dist + 1});
            }
            if (node + 1 < n && !vis[node + 1]) {
                vis[node + 1] = true;
                q.offer(new int[]{node + 1, dist + 1});
            }
            for (int next : mp.get(arr[node])) {
                if (!vis[next]) {
                    vis[next] = true;
                    q.offer(new int[]{next, dist + 1});
                }
            }
            mp.get(arr[node]).clear();
        }

        return -1;

    }
}