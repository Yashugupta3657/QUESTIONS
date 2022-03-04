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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return check(root,targetSum,0);
    }
    public boolean check(TreeNode root,int targetsum,int currs){
        if(root==null){
            return false;
        }
        if(root.left==null&&root.right==null){
            if(currs+root.val==targetsum){
                return true;
            }
        }
        boolean leftans=check(root.left,targetsum,currs+root.val);
        boolean rightans=check(root.right,targetsum,currs+root.val);
        return leftans||rightans;
    }
}
