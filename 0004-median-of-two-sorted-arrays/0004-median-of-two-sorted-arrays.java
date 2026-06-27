class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] a = new int[n+m];

        int k=0;
        for(int i=0; i<n; i++){
            a[k++] = nums1[i];
        }
        for(int i=0; i<m; i++){
            a[k++] = nums2[i];
        }
        Arrays.sort(a);
        int t = a.length;
        if(t%2==1){
            return (double)a[t/2];
        }else {
            int mid1 = a[t/2];
            int mid2 = a[(t/2)-1];
            return ((double)mid1 + (double)mid2)/2.0;
        }
    }
}