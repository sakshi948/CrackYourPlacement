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
    public int deepestLeavesSum(TreeNode root) {
        Queue<TreeNode> qu = new LinkedList<>();
        qu.offer(root);
        int sum=0,ans=0;
        while(!qu.isEmpty()){
            int level = qu.size();
            for(int i=0;i<level;i++){
                TreeNode curr = qu.poll();  
                sum+=curr.val;
                if(curr.left!=null){qu.offer(curr.left);}
                if(curr.right!=null){qu.offer(curr.right);}
            }
            ans=sum;
            System.out.println(ans);
            sum=0;
        }
        
        return ans;
    }
}