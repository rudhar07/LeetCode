class Solution(object):
    def combine(self, n, k):
        """
        :type n: int
        :type k: int
        :rtype: List[List[int]]
        """
        res=[]
        sb=[0]*k


        def bt(cnt, beg_ele):
            if cnt == k:
                res.append(sb[:])
                return 

            for i in range(beg_ele, n-k+2+cnt):
                sb[cnt] = i
                bt(cnt+1, i+1)



        bt(0,1 ) 
        return res      