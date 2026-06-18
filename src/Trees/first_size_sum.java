package Trees;

public class first_size_sum {
    public static class  Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }
    public static void Display(Node root){
        if(root==null)
            return;
        System.out.print(root.data+" -> ");
        if(root.left!=null)
            System.out.print(root.left.data+ " ");
        else
            System.out.print("null  ");
        if(root.right!=null)
            System.out.print(root.right.data);
        else
            System.out.print("null  ");
        System.out.println();
        Display(root.left);
        Display(root.right);
    }
    public static void main(String[] args){
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        a.left=b;
        a.right=c;
        Node d=new Node(40);
        Node e=new Node(50);
        b.left=d;
        b.right=e;
        Node f=new Node(60);
        c.right=f;
        Display(a);
    }
}
