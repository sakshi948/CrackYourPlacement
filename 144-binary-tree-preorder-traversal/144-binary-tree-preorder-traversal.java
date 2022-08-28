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
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> st = new Stack<>();
        ArrayList<Integer> al = new ArrayList<>();
        TreeNode curr = root;
        while(true){
            if(curr!=null){
                st.push(curr);
                al.add(curr.val);
                curr=curr.left;
            }
            else{
                if(st.isEmpty()){break;}
                curr = st.pop();
                curr = curr.right;
            }
        }
        return al;
    }
}