/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    static int d=0;
    public int diameterOfBinaryTree(TreeNode root) {
        d=0;
        fht(root);
        return d;
    }
    public int fht(TreeNode a){
        if(a==null)return 0;

        int lh = fht(a.left);
        int rh = fht(a.right);

        d = Math.max(d, lh+rh);

        return Math.max(lh,rh)+1;
    }
}