package Queue;
import java.util.*;

public class Implement_stack_using_queue {
    // Made static so it can be instantiated directly inside the static main method
    static class MyStack {
        private Queue<Integer> queue=new LinkedList<>();

        public MyStack() {
            queue = new LinkedList<>();
        }

        public void push(int x) {
            queue.add(x);
            int size = queue.size();

            for (int i = 0; i < size - 1; i++) {
                queue.add(queue.remove());
            }
        }

        public int pop() {
            return queue.remove();
        }

        public int top() {
            return queue.peek();
        }

        public boolean empty() {
            return queue.isEmpty();
        }
    }

    public static void main(String[] args) {
        MyStack obj = new MyStack();

        // Testing Push operations
        obj.push(10);
        obj.push(20);
        obj.push(30);

        // Testing Top operation (Should print 30)
        System.out.println("Top element: " + obj.top());

        // Testing Pop operations (Should print 30, then 20)
        System.out.println("Popped element: " + obj.pop());
        System.out.println("Popped element: " + obj.pop());

        // Checking if empty (Should print false because 10 is still there)
        System.out.println("Is stack empty? " + obj.empty());
    }
}