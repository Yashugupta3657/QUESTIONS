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
    int result;
    public int sumNumbers(TreeNode root) {
        result=0;         //in heap we have to manually change for multiple test cases together.
        sum(root,0);
        return result;
    }
    public void sum(TreeNode root,int ans){
        if(root==null){
            return;
        }
        if(root.left==null&&root.right==null){
            result+=ans*10+root.val;
            return;
        }
        sum(root.left,ans*10+root.val);
        sum(root.right,ans*10+root.val);
    }
}
