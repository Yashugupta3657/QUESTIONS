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
////OPTIMISED APPROACH
class Solution {
    class Pair{
        boolean bal;
        int ht;
        public Pair(boolean bal1,int ht1){
            this.bal=bal1;
            this.ht=ht1;
        }
    }
    public boolean isBalanced(TreeNode root) {
        return check(root).bal;
    }
    public int height(TreeNode root){
       if(root==null){
           return 0;
       }  
       int left=height(root.left);
        int right=height(root.right);
        return Math.max(right,left)+1;
    }
    public Pair check(TreeNode root){
        if(root==null){
            return new Pair(true,0);
        }
        Pair leftpair=check(root.left);
        Pair rightpair=check(root.right);
        int leftht=leftpair.ht;
        int rightht=rightpair.ht;
        boolean rootcheck=Math.abs(leftht-rightht)<=1?true:false;
        boolean ans=rootcheck&&leftpair.bal&&rightpair.bal;
        return new Pair(ans,Math.max(leftht,rightht)+1);
    }
}
//NORMAL APPROACH O(N^2)
// class Solution {
//     public boolean isBalanced(TreeNode root) {
//        return check(root);
//     }
//     public int height(TreeNode root){
//         if(root==null){
//             return 0;
//         }
//         int leftht=height(root.left);
//         int rightht=height(root.right);
//         return Math.max(leftht,rightht)+1;
//     }
//     public boolean check(TreeNode root){
//         if(root==null){
//             return true;
//         }
//         int leftht=height(root.left);
//         int rightht=height(root.right);
//         boolean rootcheck=Math.abs(leftht-rightht)<=1?true:false;
//         boolean leftcheck=check(root.left);
//         boolean rightcheck=check(root.right);
//         return rootcheck&&leftcheck&&rightcheck;
//     }
// }
