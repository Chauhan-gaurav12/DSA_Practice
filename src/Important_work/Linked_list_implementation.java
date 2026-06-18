package Important_work;

import java.sql.SQLOutput;

// with the help of linked list stack implementation
public class Linked_list_implementation {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static class Stack{  // user defined data Structure
        Node head=null;
        int size=0;

        void push(int x){
            Node temp=new Node(x);
            temp.next=head;
            head=temp;
            size++;
        }
        //  it will print reverse
        void display_reverse(){
            Node temp=head;
            if(head==null){
                System.out.println("No element in the list");
                return;
            }
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }
        void display_rec(Node head){
            
        }
        // display in orignal way
        void display(){

        }
        void size(){
            System.out.println("Size of Stack is : "+size);
        }
        void peek(){
            System.out.println(head.data);
        }
        void pop(){
            System.out.println(head.data);
            head=head.next;
            size--;
        }
    }
    public static void main(String[] args){
      //  Node n1=new Node(17);
        Stack st=new Stack();
        st.push(4);
        st.display();
        st.push(51);
        st.display();
        st.push(14);
        st.display();// for displaying the stack
        st.peek();
        st.pop();
        st.display();
        //System.out.println(st.size());
        st.push(78);
        st.push(98);
        st.push(77);
        st.display();
        //st.capacity();
    }
}
