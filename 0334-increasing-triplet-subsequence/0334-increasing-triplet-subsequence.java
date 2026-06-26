class Solution {
    public boolean increasingTriplet(int[] nums) {
        int fi = Integer.MAX_VALUE;
        int se = Integer.MAX_VALUE;

        for(int num : nums){
            if(num <= fi){
                fi=num;
            }else if(num <= se){
                se = num;
            }else{
                return true;
            }

        }
        
        return false;
    
    }
}