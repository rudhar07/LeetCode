class Solution {
    public int countKthRoots(int l, int r, int k) {
        int st = (int)Math.ceil(Math.pow(l, 1.0/k));
        int en = (int)(Math.pow(r, 1.0/k) + 1e-10);
        int fin = (int)Math.floor(en-st) + 1;
        return fin;
    }
}