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
    public int minDepth(TreeNode root) {
        int ans=depth(root);
        return ans==Integer.MAX_VALUE?0:ans;
    }
    public int depth(TreeNode root){
        if(root==null){
            return Integer.MAX_VALUE;
        }
        if(root.left==null&&root.right==null){
            return 1;
        }
        int a=depth(root.left);
        int b=depth(root.right);
        return Math.min(a,b)+1;
    }
}
