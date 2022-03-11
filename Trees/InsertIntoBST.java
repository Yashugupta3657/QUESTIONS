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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null){
            TreeNode mm=new TreeNode(val);
            root=mm;
        }
        else
        insert(root,val);
       return root;   
    }
    public void insert(TreeNode root,int val){
        if(root.val<val){
            if(root.right!=null){
                   insert(root.right,val);
            }
            else{
            TreeNode mm=new TreeNode(val);
            root.right=mm;
            return;
            }
        }
        else if(root.val>val){
            if(root.left!=null){
                   insert(root.left,val);
            }
            else{
            TreeNode mm=new TreeNode(val);
            root.left=mm;
            return;
            }
        }
    }
}
