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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> m=new ArrayList<>();
        List<Integer> k=new ArrayList<>();
        int count=0;
        if(root==null){
            return m;
        }
        Queue<TreeNode> que=new LinkedList<>();
        que.add(root);
        que.add(null);
        while(!que.isEmpty()){
            TreeNode front=que.remove();
            if(front==null){
                 count++;
            if(!que.isEmpty())
                { 
                    que.add(null);
                }
               if(count%2==0)
             Collections.reverse(k);
             m.add(new ArrayList<>(k));
                k.clear();
            }
            else{
                k.add(front.val);
              if(front.left!=null)
               que.add(front.left);
                if(front.right!=null)
                que.add(front.right);
            }
        }
        return m;
    }
}
