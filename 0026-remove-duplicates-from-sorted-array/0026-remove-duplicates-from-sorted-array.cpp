class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int n = size(nums);
        int i=0;
        int j=1;
        while(j<n){
            if(nums[i]<nums[j]){
                int tem = nums[i+1];
                nums[i+1] = nums[j];
                nums[j] = tem;
                i++;
            }
            j++;
        }
        return i+1;
        
    }
};