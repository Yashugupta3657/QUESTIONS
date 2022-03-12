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
    public TreeNode bstToGst(TreeNode root) {
        convert(root);
        return root;
    }
    int total=0;
    public void convert(TreeNode root){
        if(root==null){
            return;
        }
        convert(root.right);
        root.val=root.val+total;
        total=root.val;
        convert(root.left);
    }
}
