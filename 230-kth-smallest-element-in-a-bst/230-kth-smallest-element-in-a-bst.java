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
    public void inorder(TreeNode root,ArrayList<Integer> al){
        Stack<TreeNode>st = new Stack<>();
        TreeNode curr=root;
        while(true){
           while(curr!=null){
               st.push(curr);
               curr=curr.left;
           }
           if(curr==null){
               if(st.isEmpty()){
                   break;
               }
               curr=st.pop();
               al.add(curr.val);
               curr=curr.right;
           }
        }
    }
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer>al = new ArrayList<>();
        inorder(root,al);
        return al.get(k-1);
    }
}