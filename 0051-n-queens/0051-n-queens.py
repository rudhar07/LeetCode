class Solution(object):
    def solveNQueens(self, A):
        """
        :type n: int
        :rtype: List[List[str]]
        """
        res = []
        b = [['.']*A for _ in range(A)]

        def bt(b , idx):
            if idx==A:
                res.append(["".join(r) for r in b])
                return 
            
            for j in range(A):
                if b[idx][j] == '.':
                    if self.valid(idx, j, b, A):
                        b[idx][j] = 'Q'
                        bt(b, idx+1)
                        b[idx][j] = '.'

        bt(b, 0)
        return res
    def valid(self, r, c, b, A):
        for i in range(A):
            if b[r][i] == 'Q':
                return False
            if b[i][c] == 'Q':
                return False
            
            if r-i>=0 and c-i>=0 and b[r-i][c-i] == 'Q':
                return False

            if r-i>=0 and c+i<A and b[r-i][c+i] == 'Q':
                return False
            
        return True

            
        