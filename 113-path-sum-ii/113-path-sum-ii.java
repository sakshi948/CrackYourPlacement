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
    public void fn(TreeNode root,int tar,int sum,List<Integer> al,List<List<Integer>> ans){
        if(root==null){return;}
        if(root.left==null&&root.right==null&&sum+root.val==tar){
            al.add(root.val);
            ans.add(new ArrayList<>(al));
            al.remove(al.size()-1);
            return;
        }
        al.add(root.val);
        fn(root.left,tar,sum+root.val,al,ans);
        fn(root.right,tar,sum+root.val,al,ans);
        al.remove(al.size()-1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> al = new ArrayList<>();
        fn(root,targetSum,0,al,ans);
        return ans;
    }
}