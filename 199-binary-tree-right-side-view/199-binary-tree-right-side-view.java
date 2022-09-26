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
    public void fn(TreeNode root,int level,List<Integer> al){
        if(root==null){return;}
        if(al.size()==level){al.add(root.val);}
        fn(root.right,level+1,al);
        fn(root.left,level+1,al);
    }
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> al = new ArrayList<>();
        fn(root,0,al);
        return al;
    }
}