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
    public boolean check(int value,TreeNode root)
    {
        if(root == null)
        return true;

        if(root.val != value)
        return false;

        return check(value,root.left) && check(value,root.right);
    }
    public boolean isUnivalTree(TreeNode root) {
        int value = root.val;
        return check(value,root);
    }
}
