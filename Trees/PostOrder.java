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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> m=new ArrayList<Integer>();
        postorder(root,m);
        return m;
    }
    public void postorder(TreeNode root,List<Integer> m){
        if(root==null){
            return;
        }
        postorder(root.left,m);
        postorder(root.right,m);
        m.add(root.val);
    }
}
