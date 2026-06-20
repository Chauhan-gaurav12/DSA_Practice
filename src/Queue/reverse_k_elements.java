package Queue;
import java.util.*;

public class reverse_k_elements {
    public static void main(String [] args){
        Queue<Integer> qq=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        qq.add(10);
        qq.add(20);
        qq.add(30);
        qq.add(40);
        qq.add(50);
        qq.add(60);
        qq.add(70);
        System.out.println("The queue is : ");
        System.out.println(qq);

        System.out.println("Enter the value of k: ");
        int k=sc.nextInt() ;
        if(k<0 || k>=qq.size()){
            System.out.println("K element does not Exist: ");
            return ;
        }
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<k;i++){
            st.push(qq.remove());
        }
        System.out.println("Stack elements are ");
        System.out.println(st);

        while(!st.isEmpty()){
            qq.add(st.pop());
        }

        System.out.println("After reversing the queue is : ");
        System.out.println(qq);

        // now there is some problem is commming so solvng that

        int siz=qq.size()-k;
        for(int i=0;i<siz;i++){
            qq.add(qq.remove());
        }
        System.out.println("After that queue is : ");
        System.out.println(qq);
    }
}
