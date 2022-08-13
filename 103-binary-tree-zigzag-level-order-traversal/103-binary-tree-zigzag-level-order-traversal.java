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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        boolean ltor = false;
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null){return ans;}
        Queue<TreeNode>q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            LinkedList<Integer> subList = new LinkedList<>();
            int size=q.size();
            for(int i=0;i<size;i++){
                
                TreeNode curr = q.poll();
                if(curr.left!=null){
                    q.offer(curr.left);
                }
                if(curr.right!=null){
                    q.offer(curr.right);
                }
                if(ltor){
                subList.addFirst(curr.val);
                }
                else{
                    subList.addLast(curr.val);
                }
            }
            ltor=!ltor;
            ans.add(subList);
        }
        return ans;
    }
}