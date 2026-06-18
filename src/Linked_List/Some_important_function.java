package Linked_List;

public class Some_important_function {
    public static class linkedlist{
            static class Node{
            int data;
            Node next;
            Node(int data){
                this.data=data;
                this.next=null;
            }
        }
        Node head=null;
        Node tail=null;
        public void insertatend(int data){
                Node temp=new Node(data);
                if (head==null){
                    head=temp;
                }
                else{
                    tail.next=temp;
                }
                tail=temp;
        }
        public void insertatBegin(int data){
            Node temp=new Node(data);
                if(head == null){
                    head=temp;
                    tail=temp;
                }
                else{
                    temp.next=head;
                    head=temp;
                }
            }
            void display(){
                Node temp=head;
                while(temp!=null){
                    System.out.print(temp.data+" ");
                    temp=temp.next;
                }
                System.out.println("null");
            }
            int count_element(){
                Node temp=head;
                int count=0;
                while(temp!=null){
                    count++;
                    temp=temp.next;
                }
                System.out.println("total element" + count);
                return count;
            }
            void inseratgivenposition(int data,int pos){
                Node temp1=new Node(data);
                Node temp=head;
                // if position =0
                if(pos==0)
                    insertatBegin(data);
                // 
                if(pos == count_element()){
                    insertatend(data);
                    return;
                }
                for(int i=0;i<pos-1;i++){
                    if(temp==null){
                        System.out.println("Position does not exist");
                        return;
                    }
                    temp=temp.next;
                }

                temp1.next=temp.next;
                temp.next=temp1;

            }
        }

    public static void main(String[] args){
        linkedlist ll=new linkedlist();
        ll.display();
        ll.insertatend(13);
        ll.insertatBegin(12);
        ll.display();
        ll.count_element();
        ll.inseratgivenposition(25,0);
        ll.display();
        ll.inseratgivenposition(30,7);
        ll.display();
    }
}
