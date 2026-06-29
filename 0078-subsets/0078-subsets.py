class Solution(object):
    def subsets(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        res=[]
        sub = []

        n = len(nums)

        def bt(idx):
            if idx == n:
                res.append(sub[:])
                return 

            sub.append(nums[idx])
            bt(idx+1)
            sub.pop()
            bt(idx+1)
        
        bt(0)
        return res
            
        