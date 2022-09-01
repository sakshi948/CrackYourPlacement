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
    public void fn(TreeNode root,int c[],int maxi){
        if(root==null) return;
        maxi = Math.max(maxi,root.val);
        if(maxi<=root.val){
            c[0]++;
        }
        fn(root.left,c,maxi);
        fn(root.right,c,maxi);
    }
    public int goodNodes(TreeNode root) {
        int maxi = Integer.MIN_VALUE;
        int c[] = new int[1];
        c[0] = 0;
        fn(root,c,maxi);
        return c[0];
    }
}