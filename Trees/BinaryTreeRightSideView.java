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
//using while loop
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
//using recursion
class Solution {
    int maxlvl;
    List<Integer> k=new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        maxlvl=0;
        rightH(root,1);
        return k;
    }
    public void rightH(TreeNode root,int curr){
        if(root==null){
            return;
        }
        if(maxlvl<curr){
            maxlvl=curr;
            k.add(root.val);
        }
        rightH(root.right,curr+1);
        rightH(root.left,curr+1);
    }
}
