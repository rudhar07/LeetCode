class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int cnt=0;
        for(int x : arr1){
            for(int y : arr2){
                int diff= Math.abs(x-y);
                if(diff<=d){
                    cnt++;
                    break;
                }
            }
        }
        return arr1.length-cnt;
    }
}