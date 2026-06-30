class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        int i = 0;
        int j = 1;
        int n = nums.size();

        if(n==1)return;
        while(j<n){
            if(nums[i]==0 && nums[j]!=0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j++;
            }else if(nums[i]==0 && nums[j]==0){
                j++;
            }else{
                i++; j++;
            }
        }
        
    }
};