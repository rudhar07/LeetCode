class Solution(object):
    def subsetsWithDup(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        res=[]
        # sub=[]
        n=len(nums)
        nums.sort()

        def bt(idx, sub):
            res.append(sub[:])
            
            for i in range(idx, n):
                if i>idx and nums[i] == nums[i-1]:
                    continue
                sub.append(nums[i])
                bt(i+1, sub)
                sub.pop()
            
        bt(0, [])
        return res