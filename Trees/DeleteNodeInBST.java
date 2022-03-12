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
    public TreeNode deleteNode(TreeNode root, int key) {
        root=deleter(root,key);
        return root;
    }
    public TreeNode deleter(TreeNode root,int key){
        if(root==null){
            return null;
        }
        if(root.val>key){
            root.left=deleter(root.left,key);
        }
        else if(root.val<key){
            root.right=deleter(root.right,key);
        }
        else{             ///if we found the node which we have to delete
            if(root.left==null&&root.right==null){
                return null;
            }
           else if(root.left==null&&root.right!=null){
                return root.right;
            }
            else if(root.left!=null&&root.right==null){
                   return root.left;
            }
            else{ //so as to main BST order we have to check nextinordersuccesor and put that in deleting node if left and right are not null of that node.
              int inordernxtsuccesor=min(root.right);
              root.val=inordernxtsuccesor;
              root.right=deleter(root.right,inordernxtsuccesor);
            }
        }
    return root;
    }
    public int min(TreeNode root){
        if(root.left==null)
            return root.val;
        return min(root.left);
    }
}
