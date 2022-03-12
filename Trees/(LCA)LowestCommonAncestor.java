//https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    Boolean pexist;
    Boolean qexist;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode ans=find(root,p,q);
        if(pexist&&qexist)
            return ans;
        return null;
    }
    public TreeNode find(TreeNode root,TreeNode p,TreeNode q){
        if(root==null){
            return null;
        }
        TreeNode left=find(root.left,p,q);
        TreeNode right=find(root.right,p,q);
        if(root.val==p.val||root.val==q.val){
            if(root.val==p.val){
                pexist=true;
            }
            else qexist=true;
            return root;
        }
        if(left==null&&right==null){
            return right;
        }
        else if(left==null&&right!=null){
            return right;
        }
        else if(left!=null&&right==null){
            return left;
        }
        else return root;
    }
}

//this solution was valid because in constraints it was written that p and q always exist it will not give correct ans if it wasn't mention another method exists too for that.
/*class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return find(root,p,q);
    }
    public TreeNode find(TreeNode root,TreeNode p,TreeNode q){
        if(root==null){
            return null;
        }
        if(root.val==p.val||root.val==q.val){
            return root;
        }
        TreeNode left=find(root.left,p,q);
        TreeNode right=find(root.right,p,q);
        if(left!=null&&right!=null){
            return root;
        }
        else if(left!=null&&right==null)
            return left;
        else
            return right;
    }
}*/
