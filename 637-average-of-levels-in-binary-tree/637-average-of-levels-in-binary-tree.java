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
    public List<Double> averageOfLevels(TreeNode root) {
        Queue<TreeNode> qu = new LinkedList<>();
        ArrayList<Double> ans = new ArrayList<>();
        qu.offer(root);
        while(!qu.isEmpty()){
            double level = qu.size(),al=0;
            for(int i=0;i<level;i++){
                TreeNode curr = qu.poll();
                al+=curr.val;
                if(curr.left!=null){
                    qu.offer(curr.left);
                }
                if(curr.right!=null){
                    qu.offer(curr.right);
                }
            }
            //ans=ans/level;
            ans.add(al/level);
        }
        return ans;
    }
}