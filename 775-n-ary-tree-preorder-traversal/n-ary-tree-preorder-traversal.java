/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    private void preorder(Node root,ArrayList at){
        if(root==null)
            return;
        at.add(root.val);
        for(int i=0;i<root.children.size();i++){
            preorder(root.children.get(i),at);
        }
    }
    public List<Integer> preorder(Node root) {
        if(root==null){
            return new ArrayList<>();
        }
        ArrayList <Integer> at=new ArrayList<>();
        preorder(root,at);
        return at;
    }
}