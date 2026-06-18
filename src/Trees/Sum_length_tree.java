package Trees;

public class Sum_length_tree {
    static int count=0;
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

    // function to find the minimum value of the tree Node
    public static int minValue(Node root){
        if(root==null)
            return Integer.MAX_VALUE;
        return Math.min(root.data,Math.min(minValue(root.left),minValue(root.right)));
    }


    // function to find the height by edges wise
    public static int height(Node root){
        if(root==null)
            return 0;
        if(root.left==null && root.right==null)
            return 0;
        return 1+ Math.max(height(root.left),height(root.right));
    }

    // Function to check maximum of the tree nodes wise
    public static int max(Node root){
        if(root==null)
           // return 0; in this return 0 will not work with negative value
            return Integer.MIN_VALUE;
        return Math.max(root.data,Math.max(max(root.left),max(root.right)));
    }

// function to calculate the sum of the tree
    public static int Sum(Node root){
        if(root==null)
            return 0;
        return root.data+Sum(root.left)+Sum(root.right);
    }
    // function to return the product of the tree;
    public static int productValue(Node root){
        if(root==null)
            return 1;
        return root.data * productValue(root.left) * productValue(root.right);
    }

    public static int size(Node root){
        if(root==null)
            return 0;
        return 1+ size(root.left)+size(root.right);
    }
    public static void preorder(Node root){
        if(root==null) {
            return;
        }
        System.out.print(root.data+" -> ");
        count++;

        //System.out.print(root.left.data);
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args){
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        a.left=b;
        a.right=c;
        Node d=new Node(4);
        Node e=new Node(5);
        b.left=d;
        b.right=e;
        Node f=new Node(6);
        c.right=f;
       // Display(a);
        preorder(a);
       System.out.println();
//        System.out.println(count); // This is not a good approach

        int size=size(a);
        System.out.println("Size of Tree is = "+ size);

        // Calculating the sum of all tree Nodes
        System.out.println("Sum of all tree Nodes is = "+ Sum(a));

        // calculatin the Maximum value in  the tree
        System.out.println("Maximum node in tree is = "+max(a));


        System.out.println("Height of Binary tree is : "+height(a));

        System.out.println("Minimum value in the tree Node is : "+ minValue(a));

        System.out.println("Product of Binary tree is : "+ productValue(a));
    }
}

