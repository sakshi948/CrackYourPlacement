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
    public void fn(TreeNode node, int[] c, int max){
        if(node == null ) return;
        int m = Math.max(max, node.val); 
        if(m<=node.val){
            c[0]++;
           // System.out.println(node.val);
        } 
        fn(node.right, c, m);
        fn(node.left, c, m);
    }
    public int goodNodes(TreeNode root) {
        int c[] = new int[1];
        c[0] = 0;
        int m=Integer.MIN_VALUE;
        fn(root,c,m);
        return c[0];
    }
}