package Queue;
import java.util.*;
public class implementation_by_array {
    public static class QueueA{
        int f=-1;
        int r=-1;
        int size=0;
        int [] arr=new int[100];
        public void Add(int val){
            if(size==arr.length-1){
                System.out.println("Array is full");
                return;
            }
            if(f==-1 )
                f=r=0;
            arr[r++]=val;
            size++;
        }
        // removing the element
        public int remove(){
            if(r==-1)
                    return -1;
            if(f==arr.length){
                System.out.println("Alredy all element deleted ");
                return -1;
            }
            int x=arr[f++];
            size--;
            return x;
        }

        public int peekEl(){
            if(f==-1 || size==0 ) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return arr[f];
        }
        public void display(){
            if(size==0){
                System.out.println("Queue is Empty");
                return;
            }
            for(int i=f;i<r;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
    static void main(String[] args) {
        QueueA q=new QueueA();
        q.display();
        q.Add(10);
        q.Add(20);
        q.Add(30);
        q.Add(40);
        q.Add(50);
        q.display();
        q.remove();
        q.display();
        System.out.println(q.peekEl());
        System.out.println(q.size);
    }
}
