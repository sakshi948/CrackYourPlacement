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
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> qu = new LinkedList<>();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        qu.offer(root);
        int answer=root.val;
        while(!qu.isEmpty()){
            int level = qu.size();
            ArrayList<Integer> al = new ArrayList<>();
            for(int i=0;i<level;i++){
                TreeNode curr = qu.poll();
                if(curr.right!=null){
                    qu.offer(curr.right);
                    answer = curr.right.val;
                }
                if(curr.left!=null){
                    qu.offer(curr.left);
                    answer = curr.left.val;
                }
                al.add(curr.val);
            }
            ans.add(al);
        }
        return answer;
    }
}