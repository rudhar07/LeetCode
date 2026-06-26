class Solution {
    public int trap(int[] a) {
        int rain=0;
        int n=a.length;
    int index=0;
    int l=0;
    int r=n-1;
    int lmax=0;
    int rmax=0;


    while(l<r){
      if(a[l]<=a[r]){
        if(a[l]>lmax)lmax=a[l];
        
        l++;
      }else{
        if(a[r]>rmax)rmax=a[r];
        r--;
      }
      if(lmax>a[l])rain+=lmax-a[l];
      if(rmax>a[r])rain+=rmax-a[r];
      
    }
    return rain;


    }
}