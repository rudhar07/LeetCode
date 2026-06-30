import heapq
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def kthSmallest(self, root: Optional[TreeNode], k: int) -> int:
        self.a = []
        self.insert(root)
        heapq.heapify(self.a)
        for _ in range(k-1):
            heapq.heappop(self.a)
        
        return self.a[0]

    def insert(self, rt):
        if not rt:
            return
        
        self.a.append(rt.val)
        self.insert(rt.left)
        self.insert(rt.right)