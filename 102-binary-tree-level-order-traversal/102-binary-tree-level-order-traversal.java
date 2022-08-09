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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> qu = new LinkedList<>();
        List<List<Integer>> al = new ArrayList<>();
        //List<Integer> subList = new List<>();
        qu.offer(root);
        if(root==null){return al;}
        while(!qu.isEmpty()){
        int size = qu.size();
        List<Integer> subList = new ArrayList<>();
        for(int i=0;i<size;i++){
            if(qu.peek().left!=null){
                qu.offer(qu.peek().left);
            }
            if(qu.peek().right!=null){
                qu.offer(qu.peek().right);
            }
            subList.add(qu.poll().val);
            }
            al.add(subList);
        }
        return al;
    }
}