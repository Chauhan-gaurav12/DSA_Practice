package Trees;

import java.sql.SQLOutput;

public class Traversal {
   public static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    // code for preorder traversal
    public static void preOrder(Node root){
       if(root==null)
            return;
       System.out.print(root.data+"-> ");
       preOrder(root.left);
       preOrder(root.right);
    }

    // code for Post order traversal in a tree
    public static void postOrder(Node root){
       if(root==null)
            return;
       postOrder(root.left);
       postOrder(root.right);
       System.out.print(root.data+"-> ");
    }

    // this function is for Inorder Traversal
    public static void inOrder(Node root){
       if(root==null)
            return;
       inOrder(root.left);
       System.out.print(root.data+"-> ");
       inOrder(root.right);
    }
    public static void main(String[] args){
        Node root=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        root.left=b;
        root.right=c;
        Node d=new Node(40);
        Node e=new Node(50);
        b.left=d;
        b.right=e;
        Node f=new Node(60);
        Node g=new Node(70);
        c.left=f;
        c.right=g;
        System.out.println("PreOrder traversal is....");
        preOrder(root);
        System.out.println();
        System.out.println("Post order traver sal is ....");
        postOrder(root);
        System.out.println();
        System.out.println("Inorder Traversal is...");
        inOrder(root);
    }
}
