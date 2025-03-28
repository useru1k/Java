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
    public void levelOrder(TreeNode root,int level,List<List<Integer>> result)
    {
        if(root == null)
        return;

        if(result.size() <= level)
        result.add(new ArrayList<>());

        result.get(level).add(root.val);

        levelOrder(root.left,level+1,result);
        levelOrder(root.right,level+1,result);
    }
    public List<Double> averageOfLevels(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        List<Double> res = new ArrayList<>();
        levelOrder(root,0,result);
        for(List<Integer> en : result)
        {
            long sum = 0;
            for(int i : en)
            {
                sum += i;
            }
            double db = sum * 1.0  / en.size();
            res.add(db);
        }
        return res;
    }
}
