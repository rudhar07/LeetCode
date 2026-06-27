class Solution {
    public int countEven(int num) {
        int n =num;
        int sum=0;

        while(num>0){
            int r = num%10;

            sum+=r;

            num/=10;
        }

        if(sum%2==0 || n%2==1)return n/2;

        return n/2 -1;
        
    }
}