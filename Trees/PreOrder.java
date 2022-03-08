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
//iterative way using stack==>>>
class Quad{
    TreeNode take;
    boolean isleftD;
    boolean isrightD;
    boolean isselfD;
    public Quad(TreeNode take){
        this.take=take;
    }
}
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> done=new ArrayList<>();
        if(root==null){
            return done;
        }
        Stack<Quad> st=new Stack<>();
        Quad str=new Quad(root);
        st.push(str);
        while(!st.isEmpty()){
            Quad front=st.peek();
            if(front.isselfD!=true){
                done.add(front.take.val);
                front.isselfD=true;
            }else if(front.isleftD!=true)
            {
                front.isleftD=true;
                if(front.take.left!=null)
                st.push(new Quad(front.take.left));
            }
            else if(front.isrightD!=true)
            {
                front.isrightD=true;
                if(front.take.right!=null)
                st.push(new Quad(front.take.right));
            }
            else{
                st.pop();
            }
        }
        return done;
    }
}
//recursive way==>>>>>
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> m=new ArrayList<Integer>();
         preorder(root,m);
        return m;
    }
    public void preorder(TreeNode root,List<Integer> m){
        if(root==null){
            return;
        }
        m.add(root.val);
        preorder(root.left,m);
        preorder(root.right,m);
        
    }
}
