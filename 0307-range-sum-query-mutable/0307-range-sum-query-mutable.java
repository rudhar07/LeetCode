class NumArray {
    int[] arr;
    int[] tree;
    int n;

    public NumArray(int[] nums) {
        this.arr = nums;
        n = nums.length;
        tree = new int[4*n];
        build(1, 0, n-1);
    }
    
    public void update(int index, int val) {
        updateM(1, 0, n-1, index, val);
    }
    
    void updateM(int idx, int st, int end, int pos, int val){
        if(st==end){
            tree[idx] = val;
            arr[st] = val;
            return;
        }
        int mid = (st+end)/2;
        if(pos<=mid) updateM(2*idx, st, mid, pos, val);
        else updateM(2*idx+1, mid+1, end, pos, val);

        tree[idx] = tree[2*idx]+tree[2*idx+1];
    }
    
    public int sumRange(int left, int right) {
        return query(1, 0 , n-1, left, right);
    }
    int query(int idx, int st, int end, int l, int r){
        if(st>r || l>end)return 0;

        if(l<=st && end<=r)return tree[idx];

        int mid = (st+end)/2;
        int lef = query(2*idx, st, mid, l, r);
        int righ = query(2*idx+1, mid+1, end, l , r);

        return lef + righ;
    }
    void build(int idx, int st, int end){
        if(st==end){
            tree[idx] = arr[st];
            return;
        }
        int mid = (st+end)/2;
        build(2*idx, st, mid);
        build(2*idx+1, mid+1, end);
        tree[idx] = tree[2*idx]+tree[2*idx+1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */