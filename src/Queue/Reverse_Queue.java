package Queue;
import java.util.*;
public class Reverse_Queue {

    public static void main(String[] args){
        Queue<Integer> qr=new LinkedList<>();
        Stack<Integer> st=new Stack<>();
        qr.add(10);
        qr.add(20);
        qr.add(30);
        qr.add(40);
        qr.add(50);
        System.out.println("The queue is : ");
        System.out.println(qr);
        while(!qr.isEmpty()){
            st.push(qr.remove());
        }
        System.out.println("Stack is :");
        System.out.println(st);

        while(!st.isEmpty()){
            qr.add(st.pop());
        }
        System.out.println("After reversing the queue is : ");
        System.out.println(qr);
    }
}
