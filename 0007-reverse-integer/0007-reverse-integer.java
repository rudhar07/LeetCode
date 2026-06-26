class Solution {
    public int reverse(int q) {
        
    long ans=0;

    while(q!=0){
      int y=q%10;
      ans=ans*10+y;
      q /= 10;
    }
      if(ans<Integer.MIN_VALUE || ans>Integer.MAX_VALUE){
        return(0);
      }else{
    return((int)ans);}
    }
}