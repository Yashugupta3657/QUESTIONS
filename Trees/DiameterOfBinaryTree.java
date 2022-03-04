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
    public int diameterOfBinaryTree(TreeNode root) {
        int t= height(root);
        return ans;
    }
    int ans=0;
    public int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftht=height(root.left);
        int rightht=height(root.right);
        ans=Math.max(ans,leftht+rightht);
        return 1+Math.max(leftht,rightht);
    }
}
