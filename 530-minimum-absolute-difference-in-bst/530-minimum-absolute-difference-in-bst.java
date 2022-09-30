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
    public void fn(TreeNode root,ArrayList<Integer> al){
        if(root==null){return;}
        fn(root.left,al);
        al.add(root.val);
        fn(root.right,al);
    }
    public int getMinimumDifference(TreeNode root) {
        ArrayList<Integer> al = new ArrayList<>();
        fn(root,al);
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<al.size();i++){
            for(int j=i+1;j<al.size();j++){
                mini = Math.min(mini,al.get(j)-al.get(i));
            }
        }
        return mini;
    }
}