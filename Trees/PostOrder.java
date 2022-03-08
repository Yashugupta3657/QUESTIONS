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
//iterative way=>>>
class Check{
    TreeNode curr;
    boolean isleft;
    boolean isright;
    boolean isself;
    public Check(TreeNode curr){
        this.curr=curr;
    }
}
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> done=new ArrayList<>();
        if(root==null)
            return done;
        Stack<Check> st=new Stack<>();
        st.push(new Check(root));
        while(!st.isEmpty()){
            Check front=st.peek();
            if(!front.isleft){
                 if(front.curr.left!=null)
                     st.push(new Check(front.curr.left));
                front.isleft=true;
            }
            else if(!front.isright){
                if(front.curr.right!=null)
                st.push(new Check(front.curr.right));
                front.isright=true;
            }
            else if(!front.isself){
                if(front.curr!=null)
                done.add(front.curr.val);
                front.isself=true;
            }
            else{
                st.pop();
            }
        }
        return done;
    }
}
//recursion=>>>
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
