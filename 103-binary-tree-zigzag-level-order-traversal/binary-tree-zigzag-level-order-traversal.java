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

        List<List<Integer>> res=new ArrayList<>();
        Queue<TreeNode> qt=new LinkedList<>();

        qt.add(root);
        Boolean left_to_right=true;
        while(!qt.isEmpty()){
            int size=qt.size();
            ArrayList<Integer> ans=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode temp=qt.poll();
        // here we are checking we have to go right or left now 
                if(left_to_right)
                    ans.addLast(temp.val);
                else
                    ans.addFirst(temp.val);

                if(temp.left!=null){
                    qt.add(temp.left);
                }
                if(temp.right!=null){
                    qt.add(temp.right);
                }
            }
            left_to_right=!left_to_right;
            res.add(ans);
        }
        return res;
    }
}