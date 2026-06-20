package Queue;
import java.util.*;

public class Deque_uses {
    public static void main(String[] args){
        Deque<Integer> dq=new LinkedList<>();
        // adding ,removing ,peek,poll in queue

        dq.addLast(1);
        dq.addFirst(10);
        dq.addLast(2);
        dq.addFirst(20);
        dq.addLast(3);
        dq.addFirst(30);

        System.out.println(dq);
        System.out.println(dq.contains(2));
        System.out.println(dq.getFirst());
        System.out.println(dq.getLast());
        dq.add(4);
        System.out.println(dq);

        // remove remove the element from first
        dq.remove();
        System.out.println(dq);
        dq.removeLast();
        dq.removeFirst();
        System.out.println(dq);
    }
}
