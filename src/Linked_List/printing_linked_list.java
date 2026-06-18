package Linked_List;

public class printing_linked_list {
    static class  Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static void main(String[] args){
        Node n1=new Node(10);
        Node n2=new Node(15);
        Node n3=new Node(20);
        n1.next=n2;
        n2.next=n3;
        Node temp=n1;
        while(temp!=null){
            System.out.print(temp.data+" ");// it will print whole linked list one by one
            temp=temp.next;
        }
        System.out.println("\n"+n1.data);// This will print 10
        System.out.println(n1.next.data);// this will print 15
    }
}
