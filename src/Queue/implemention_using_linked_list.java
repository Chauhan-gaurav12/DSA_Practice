package Queue;

import java.util.*;

public class implemention_using_linked_list {
    public static class Node{
        int val;
        Node next;

        Node(int data){
            this.val=data;
            this.next=null;
        }
    }
    public static class QueueLL{
        Node head=null;
        Node tail=null;
        int size=0;
        public  void add(int val){
            Node temp=new Node(val);

            if(size==0){
                head=temp;
                tail=temp;
            }else{
                tail.next=temp;
                tail=temp;
            }
            size++;
        }
        public int remove(){
            if(size==0){
                System.out.println("Queue has no element !!");
                return -1;
            }
            int temp=head.val;
            head=head.next;
            size--;
            return temp;
        }
        public int peek(){
            if(head==null){
                System.out.println("Queue is Empty !! ");
                return -1;
            }
            return head.val;
        }
        public int size(){
            if(size==0){
                System.out.println("Queue is Null no such element exist !! ");
                return -1;
            }
            return size;
        }
        public void display(){
            if(size==0){
                System.out.println("Queue is Empty !! ");
                return;
            }
            Node temp=head;
            System.out.println("The queue element is : ");
           while(temp!=null){
               System.out.print(temp.val+" ");
               temp=temp.next;
           }
            System.out.println();
        }
        public Boolean isEmpty(){
            if(size==0){
                return true;
            }
            else{
                return false;
            }
        }
    }
    public static void main(String[] arga){
        QueueLL tail=new QueueLL();
        System.out.println("Queue is empty : "+tail.isEmpty());
        tail.add(10);
        tail.add(20);
        tail.add(30);
        tail.add(40);
        tail.add(50);
        tail.add(60);
        tail.display();
        System.out.println("Queue remove element is : "+tail.remove());
        System.out.println("Queue size is : "+tail.size());
        tail.display();
    }
}
