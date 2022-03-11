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
    TreeNode m=null;
    public TreeNode searchBST(TreeNode root, int val) {
    search(root,val);
        return m;
    }
    public void search(TreeNode root,int val){
         if(root==null){
            return;
        }
        if(root.val==val){
            m=root;
            return;
        }
        if(root.val<val){
           search(root.right,val);
        }
        else if(root.val>val){
            search(root.left,val);
        } 
    }
}
