class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
         List<List<Integer>> m=new ArrayList<>();
      List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ini=new ArrayList<>();
        Queue<TreeNode> que=new LinkedList<>();
        if(root==null)
            return m;
        que.add(root);
        que.add(null);
        while(!que.isEmpty()){
            TreeNode front=que.remove();
            if(front==null){
                if(!que.isEmpty()){
                   que.add(null);
                }
                 m.add(new ArrayList<>(ini));    
                ini.clear();
            }
            else{
            ini.add(front.val);
            if(front.left!=null){
                que.add(front.left);
            }
            if(front.right!=null){
                que.add(front.right);
            }
            }
        }
        for(int i=m.size()-1;i>=0;i--){
           ans.add(m.get(i)) ;
        }
        return ans;
    }
}
