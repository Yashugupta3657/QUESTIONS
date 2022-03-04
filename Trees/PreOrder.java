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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> m=new ArrayList<Integer>();
         preorder(root,m);
        return m;
    }
    public void preorder(TreeNode root,List<Integer> m){
        if(root==null){
            return;
        }
        m.add(root.val);
        preorder(root.left,m);
        preorder(root.right,m);
        
    }
}
