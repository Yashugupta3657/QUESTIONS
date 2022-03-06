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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> m=new LinkedList<>();
        List<List<Integer>> k=new ArrayList<>();
               if(root==null){
                 return k;   
        }
              List<Integer> lvl=new ArrayList<>();
        m.add(root);
        m.add(null);
        while(!m.isEmpty()){
            TreeNode front=m.remove();
            if(front==null){
                if(!m.isEmpty()){
                    m.add(null);
                }
                 k.add(lvl);
                lvl=new ArrayList<>();
            }
            else{
            lvl.add(front.val);
            if(front.left!=null){
                m.add(front.left);
            }
            if(front.right!=null){
                m.add(front.right);
            }
            }
        }
        return k;
    }
}
