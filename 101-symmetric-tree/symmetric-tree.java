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
    public boolean isSymmetric(TreeNode root) {
        mirror(root.left);
        return isIdentical(root.left,root.right);
    }
    boolean isIdentical(TreeNode p1,TreeNode p2){
        if(p1==null && p2==null)
            return true;
        if(p1==null || p2==null){
            return false;
        }
        if(p1.val!=p2.val){
            return false;
        }
        return (isIdentical(p1.left,p2.left) && isIdentical(p1.right,p2.right));
    }
    void mirror(TreeNode root){
        if(root==null)
            return;
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;
        mirror(root.left);
        mirror(root.right);
    }
}