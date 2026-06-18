package Important_work;
// reverse the given stack
import java.util.Stack;

public class prpgram_5 {
    static void pushAtBottom(Stack<Integer> st,int top){
        Stack<Integer> rt =new Stack<>();
        while(!st.isEmpty()){
            rt.push(st.pop());
        }
        st.push(top);
        while (!rt.isEmpty()) {
            st.push(rt.pop());
        }
    }
   static void reverse(Stack <Integer> st){
        if(st.size()==1)
                return;
        int top=st.pop();
        reverse(st);
        pushAtBottom(st,top);
    }
    public static void main(String[] args){
        Stack<Integer> st=new Stack<>();
        st.push(15);
        st.push(20);
        st.push(25);
        st.push(30);
        st.push(35);
        st.push(40);
        st.push(45);
        st.push(50);
        System.out.println(st);
        reverse(st);
        System.out.println(st);
    }
}
