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
    public boolean fn(TreeNode root,int tar){
        if(root==null){return false;}
        if(root.left==null&&root.right==null&&tar-root.val==0){return true;}
        boolean left = fn(root.left,tar-root.val);
        boolean right = fn(root.right,tar-root.val);
        return left||right;
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return fn(root,targetSum);
    }
}