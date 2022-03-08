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
    public TreeNode sufficientSubset(TreeNode root, int limit) {
        boolean m=path(root,limit,0);
        if(m==false)//delete root node too
            return null;
        return root;
    }
    public boolean path(TreeNode root,int limit,int currs){
        if(root==null){
            return false;
        }
        if(root.left==null&&root.right==null)
        {
            if(currs+root.val<limit)
                return false;
            return true;
        }
        boolean lefty=path(root.left,limit,currs+root.val);
        boolean righty=path(root.right,limit,currs+root.val);
        if(lefty==false&&righty==false)
            return false;
        else if(lefty==false){
            root.left=null;
        }
        else if(righty==false){
            root.right=null;
        }
        return lefty||righty; 
    }
}
