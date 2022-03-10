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
    public boolean flipEquiv(TreeNode root1, TreeNode root2) {  //check if it could be transformed or it is equal given already return true
       return check(root1,root2);
    }
    public boolean check(TreeNode root1,TreeNode root2){
        if(root1==null&&root2==null)
            return true;
        if(root1==null&&root2!=null||root2==null&&root1!=null)
            return false;
        if(root1.val!=root2.val)
            return false;
        boolean check1=check(root1.left,root2.right);
        boolean check2=check(root1.right,root2.left);
        boolean check3=check(root1.left,root2.left);
        boolean check4=check(root1.right,root2.right);
        return (check1&&check2) || (check3&&check4);
    }
}
