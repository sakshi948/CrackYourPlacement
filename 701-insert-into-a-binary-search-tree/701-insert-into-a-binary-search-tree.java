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
    public TreeNode fn(TreeNode root,int val){
        if(root.left==null&&root.right==null){
            return root;
        } 
        if(root.left!=null&&root.val>val){
            return fn(root.left,val);
        }
        if(root.right!=null&&root.val<val){
            return fn(root.right,val);
        }
        return root;
    }
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null){return new TreeNode(val);}
        TreeNode curr = fn(root,val);
        if(curr.val<val){
            curr.right = new TreeNode(val);
        }
        else{
            curr.left = new TreeNode(val);
        }
        return root;
    }
}