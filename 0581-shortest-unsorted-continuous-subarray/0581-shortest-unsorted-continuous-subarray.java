class Solution {
    public int findUnsortedSubarray(int[] A) {
        int n=A.length;
        int en=-2;
        int st=-1;
        int min = A[n-1], max = A[0];
        for (int i=1;i<n;i++) {
            max = Math.max(max, A[i]);
            min = Math.min(min, A[n-1-i]);
            if (A[i] < max)en=i;
            if (A[n-1-i] > min)st = n-1-i; 
        }
        return en - st + 1;
    }
}