class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer> s = new HashSet<Integer>();
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int max3=Integer.MIN_VALUE;
        int n=0;
        for(int x : nums){
            s.add(x);
            if(x==max1 || x==max2 || x==max3){
                continue;
            }
            if(max1 == Integer.MIN_VALUE || x>max1){
                max3=max2;
                max2=max1;
                max1=x;
                n=1;
            }else if(max2==Integer.MIN_VALUE || x>max2){
                max3 = max2;
                max2 = x;
                n=1;
            }else if(max3==Integer.MIN_VALUE || x>max3){
                max3=x;
                n=1;
            }
        }
        if(s.size()<3)return max1;
        if(n==1)return max3;
        return max1;
    }
}