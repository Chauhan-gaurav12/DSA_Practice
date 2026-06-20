package Queue;
import java.util.*;
public class circular_queue {
    public static class queue_Array{
        int front=-1;
        int rear=-1;
        int size=0;
        int []arr=new int[8];
        public void add(int data){
            if(size==arr.length){ // checking array is full or not
                System.out.println("Queue is Full");
            }
            else if(size==0){ // if queue enter element is first 0 then fron and queue set to 0
                front=rear=0;
                arr[rear]=data;
                size++;
            }
            // if rear not reached at last then enter the element at last
            else if (rear <arr.length-1){
                arr[++rear]=data;
                size++;
            }
            // if rear reahed at end and there is empty space from 0 then rear set 0
            else if(rear ==arr.length-1){
                rear=0;
                arr[0]=data;
                size++;
            }
        }

        // removing element from linked list

        public int remove(){
            if(size==0){
                System.out.println("Queue is Empty !!");
                return -1;
            }
            // agr fronnt chhota hai to array length se
            else if(front==arr.length-1){
                int val=arr[front];
                front=0;
                size--;
                return val;
            }
            else{
                int val=arr[front];
                front++;
                size--;
                return val;
            }
        }
        // for peek element
        public int peek(){ //throws Exception{
            if(size ==0) {
                //throw new Exception("Queue is Empty !!");
                System.out.println("Queue is empty !!");
                return -1;
            }
            else
                return arr[front];
        }
        // for check isEmpty
        public Boolean isEmpty(){
            if(size==0)
                return true;
            else
                return false;
        }


        // for displaying queue
        public void display(){
            if (size == 0) {
                System.out.println("Queue is Empty !! ");
            }
            else if(front <= rear){
                for(int i=front;i<=rear;i++){
                    System.out.print(arr[i]+" ");
                }
            }
            else { //rear< front
                // front to at last
                for(int i=front;i<arr.length;i++){
                    System.out.print(arr[i]+" ");
                }
                // now again to front to rear
                for(int i=0;i<=rear;i++){
                    System.out.print(arr[i] +" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        queue_Array q=new queue_Array();
        q.display();
        q.add(10);
        System.out.println("Queue is empty or not : "+q.isEmpty());
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        System.out.println("Queue size is : "+q.size);
        System.out.println("Queue top element is : "+q.peek());
        q.display();
        System.out.println("Removed element : "+q.remove());
        System.out.println("Removal element : "+q.remove());
         q.add(70);
         q.add(70);
         q.add(80);
        System.out.println("Queue size is : "+q.size);
        q.add(90);
        q.add(100);
        q.display();
        System.out.println(q.peek());
        q.add(110);

    }
}
