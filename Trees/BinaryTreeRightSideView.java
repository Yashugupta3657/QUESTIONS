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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> sol=new ArrayList<>();
        Queue<TreeNode> m=new LinkedList<>();
        if(root==null){
            return sol;
        }
        m.add(root);
        while(!m.isEmpty()){
              int n=m.size();
            for(int i=1;i<=n;i++){
                 TreeNode front=m.remove();
                if(i==n){
                    sol.add(front.val); 
                  }
                if(front.left!=null){
                m.add(front.left);
                  }
            if(front.right!=null){
                m.add(front.right);
                 }
            }
        }
        return sol;
    }
}
