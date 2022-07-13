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
        ArrayList<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> qu = new LinkedList<>();
        if(root==null){return ans;}
        qu.offer(root);
        while(!qu.isEmpty())
        {
            ArrayList<Integer> subList = new ArrayList<>();
            int level = qu.size();
            for(int i=0;i<level;i++)
            {
                if(qu.peek().left!=null){qu.offer(qu.peek().left);}
                if(qu.peek().right!=null){qu.offer(qu.peek().right);}
                subList.add(qu.poll().val);
            }
            ans.add(subList);
        }
        return ans;
        }
    }
