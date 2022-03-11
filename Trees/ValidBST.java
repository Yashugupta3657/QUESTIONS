
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
    public boolean isValidBST(TreeNode root) {
        //Another methodfind inorder traversal and then check if it is in sorted manner
        
        return check(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    public boolean check(TreeNode root,long minr,long maxr){
        if(root==null){
            return true;
        }
        if(root.val<=minr||root.val>=maxr){
            return false;
        }
        boolean leftTree=check(root.left,minr,root.val);
        boolean rightTree=check(root.right,root.val,maxr);
            return leftTree&&rightTree;
    }
}
