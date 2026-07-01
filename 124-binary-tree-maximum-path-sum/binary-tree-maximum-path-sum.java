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
    int maxSum=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
    if(root==null) return 0;
    maxSum_calculate(root);
    return maxSum;
    }
    private int maxSum_calculate(TreeNode root){
        if(root==null)
            return 0;
        int leftsum=Math.max(0,maxSum_calculate(root.left));
        int rightsum=Math.max(0,maxSum_calculate(root.right));
        int currentSum= leftsum + rightsum + root.val;
        maxSum=Math.max(maxSum,currentSum);
        return root.val+Math.max(leftsum,rightsum);
    }
}