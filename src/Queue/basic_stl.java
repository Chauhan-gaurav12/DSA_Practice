package Queue;
import java.util.*;
public class basic_stl {
    public static void main(String[] args){
        Queue<Integer> q=new LinkedList<>();
        System.out.println("Is queue empty : "+q.isEmpty());
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        System.out.println("Queue size is : "+q.size());
        System.out.println("The que is \n"+q);
        System.out.println("Top element is :"+q.peek());
        System.out.println("Top element is :"+q.element());
        q.poll();
        System.out.println("After deleting top element from queue is : \n"+q);
        q.remove();// it is also use for remove the top most element
        System.out.println("After one more removin : \n"+q);
        System.out.println("Now queue size : "+q.size());
    }
}
