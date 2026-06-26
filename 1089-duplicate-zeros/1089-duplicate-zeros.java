class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int z =0;
        for (int i = 0; i < n; i++) {
        if (arr[i] == 0) {
            z++;
        }
    }

    // Second pass: shift elements from the end to the beginning.
    int i = n - 1;
    while (i >= 0) {
        if (arr[i] == 0) {
            if (i + z < n) {
                arr[i + z] = 0;
            }
            z--;
            if (i + z < n) {
                arr[i + z] = 0;
            }
        } else {
            if (i + z < n) {
                arr[i + z] = arr[i];
            }
        }
        i--;
    }
    }
}