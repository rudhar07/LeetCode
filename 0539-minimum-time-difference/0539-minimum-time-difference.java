class Solution {
    public int findMinDifference(List<String> tp) {
        int si = tp.size();
        ArrayList<Integer> li = new ArrayList<>();
        for(String t : tp){
            String[] pt = t.split(":");
            int hr = Integer.parseInt(pt[0]);
            int min = Integer.parseInt(pt[1]);
            li.add(60*hr + min);
        }
        Collections.sort(li);
        int minDiff=2401;
        for(int i=1; i<si;i++){
            int d = li.get(i)-li.get(i-1);
            minDiff = Math.min(minDiff, d);
        }
        minDiff = Math.min(minDiff, 1440 + li.get(0) - li.get(si - 1));
        return minDiff;
    }
}