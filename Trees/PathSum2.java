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
    List<List<Integer>> sol=new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> part=new ArrayList<>();
        path(root,targetSum,0,part);
        return sol;
    }
    public void path(TreeNode root,int targetsum,int currs,List<Integer> part){
        if(root==null){
            return;
        }
        if(root.left==null&&root.right==null){
            if(currs+root.val==targetsum){
                part.add(root.val);
                sol.add(new ArrayList<>(part));   //we have to pass new copy because if we pass refrence it will change because of backtracking we are doing
                part.remove(part.size()-1);
                return;
            }
        }
        part.add(root.val);
        path(root.left,targetsum,currs+root.val,part);
        path(root.right,targetsum,currs+root.val,part);
        part.remove(part.size()-1);            //list will not change because it is in heap so we have to manually remove to get previous state of list.
    }
}
