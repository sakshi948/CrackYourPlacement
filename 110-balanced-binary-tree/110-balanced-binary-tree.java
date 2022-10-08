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
    int flag=1;
    public int fn(TreeNode root){
        if(root==null){return 0;}
        
        int left =1+fn(root.left);
        int right =1+fn(root.right);
        
        if(Math.abs(left-right)>1)
        {   flag=0;
            
        }
        return Math.max(left, right);
    }
    public boolean isBalanced(TreeNode root) {
        fn(root);
        if(flag==1){return true;}
        return false;
    }
}