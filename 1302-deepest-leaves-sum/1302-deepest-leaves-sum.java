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
    public int fn(TreeNode root,int height){
        if(root==null){return 0;}
        if(height==1){return root.val;}
        int left = fn(root.left,height-1);
        int right = fn(root.right,height-1);
        return left+right;
    }
    public int height(TreeNode root){
        if(root==null){return 0;}
        int left = height(root.left);
        int right = height(root.right);
        return 1+Math.max(left,right);
    }
    public int deepestLeavesSum(TreeNode root) {
        int h = height(root);
        return fn(root,h);
    }
}