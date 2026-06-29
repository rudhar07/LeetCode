# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def inorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        self.a=[]

        self.ino(root)
        return self.a
    
    def ino(self, rt):
        if not rt:
            return 
        

        self.ino(rt.left)
        self.a.append(rt.val)
        self.ino(rt.right)