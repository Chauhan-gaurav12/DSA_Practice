/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p==root || q==root || root ==null ) return root;
        if(p==q) return p; 

        TreeNode leftp=lowestCommonAncestor(root.left,p,q);
        TreeNode rightq=lowestCommonAncestor(root.right,p,q);
        // If both subtrees returned something, root is the lowest common ancestor
        if(leftp!= null && rightq!=null) return root;

          // If only one subtree returned a node, pass that valid result up the tree
        return (leftp!=null) ? leftp:rightq;
    }
}