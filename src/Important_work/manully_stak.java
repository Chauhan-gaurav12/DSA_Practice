package Important_work;
//import java.util.*;

import java.sql.SQLOutput;

public class manully_stak {
    public static class Stack{
        int [] arr=new int[5];
        private int idx=-0;
        void push(int x){
            if(isFull()){
                System.out.println("Stack is full");
                return ;
            }
            arr[idx]=x;
            idx++;
        }
        int peek(){
            if(idx==0) {
                System.out.println("Stack Have no element");
                return -1;
            }
            return arr[idx-1];
        }
        int pop(){
            if(idx==0){
                System.out.println("Stack UnderFlow");
                return -1;
            }
            int ele=arr[idx];
            arr[idx]=0;
            idx--;
            return ele;
        }
        void display(){
            for(int i=0;i<idx;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        int size(){
            return idx;
        }
        boolean isEmpty(){
            if(idx==0){
                return true;
            }
            else
                return false;
        }
        boolean isFull(){
            if(idx==arr.length)
                return true;
            else
                return false;
        }
        void capacity(){
            System.out.println(arr.length);
        }
    }
    public static void main(String[] args){
        //Stack<Integer> st=new Stack<>();
        Stack st=new Stack();
        st.push(4);
        st.push(51);
        st.push(14);
        st.display();// for displaying the stack
        st.peek();
        st.pop();
        st.display();
        System.out.println(st.size());
        st.push(78);
        st.push(98);
        st.push(77);
        st.display();
        st.capacity();
        //st.push(9888);

    }
}
