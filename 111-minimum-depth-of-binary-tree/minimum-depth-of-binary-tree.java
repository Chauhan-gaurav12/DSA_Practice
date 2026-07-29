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
    public int minDepth(TreeNode root) {
        if(root==null)
            return 0;
         // with the help of queue
         Queue <TreeNode> ans=new LinkedList<>();
         int depth=1;
         ans.add(root);
         while(!ans.isEmpty()){
            int level=ans.size();
            for(int i=0;i<level;i++){
                TreeNode temp=ans.poll();

                // check that temp node is leaf node 
                if(temp.left==null && temp.right==null)
                    return depth;
                
                //  if not leaf node so add children into queue 
                if(temp.left!=null)
                    ans.add(temp.left);
                if(temp.right!=null)
                    ans.add(temp.right);
            }
            depth++;
         }
         return depth;
    }
}