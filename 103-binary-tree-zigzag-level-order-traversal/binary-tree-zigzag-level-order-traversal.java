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
        if(root==null)
            return new ArrayList<>();
        List<List<Integer>> result =new ArrayList<>();
        Queue<TreeNode> que=new LinkedList<>();
        boolean lefttoRight=true;
        que.add(root);
        while(!que.isEmpty()){
            LinkedList<Integer> ans=new LinkedList<>();
            int n =que.size();
            for(int i=0;i<n;i++){
                TreeNode temp=que.poll();

                if(lefttoRight)
                    ans.add(temp.val);
                else
                    ans.addFirst(temp.val);

                    
                if(temp.left!=null)
                    que.add(temp.left);
                if(temp.right!=null)
                    que.add(temp.right);
            }
            result.add(ans);
            lefttoRight=!lefttoRight;
        }
        return result;
        
    }
}