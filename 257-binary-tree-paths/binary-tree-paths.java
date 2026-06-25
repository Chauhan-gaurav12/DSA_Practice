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
    private void helper(TreeNode root,List<String> ss,String s){
        if(root == null)
            return;
        if(root.left ==null && root.right==null){
            s+=root.val;
            ss.add(s);
            return;
        }

        helper(root.left,ss,s+root.val+"->");
        helper(root.right,ss,s+root.val+"->");
    }
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> ss=new ArrayList<>();
        helper(root,ss,"");

        return ss;
    }
}