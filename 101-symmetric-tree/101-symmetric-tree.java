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
    public boolean fn(TreeNode left,TreeNode right){
        if(left==null||right==null){return left==right;}
        if(left.val!=right.val){
            return false;
        }
        boolean one = fn(left.left,right.right);
        boolean two = fn(left.right,right.left);
        return one&&two;
    }
    public boolean isSymmetric(TreeNode root) {
        return fn(root.left,root.right);
    }
}