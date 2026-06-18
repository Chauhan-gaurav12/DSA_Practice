package Queue;
import java.util.*;
public class printing_queue_element {
    static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        int s=q.size();
        Queue<Integer> n=new LinkedList<>();
        for(int i=0;i<s;i++){
            System.out.print(q.peek()+" ");
            n.add(q.remove());
        }
        System.out.println();
        while( n.size() > 0){
            System.out.print(n.poll()+" "); // it will lost all element
        }
    }
}
