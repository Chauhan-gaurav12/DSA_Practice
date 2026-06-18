package Stack;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Stack;
public class insert_anyindex {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            Stack<Integer> st = new Stack<>();
            Stack<Integer> temp=new Stack<>();
            System.out.print("Enter the size of stack");
            int n=sc.nextInt();
            System.out.println("Enter the stack element");
            for(int i=0;i<n;i++){
                int x=sc.nextInt();
                st.push(x);
            }
            System.out.println("The stack is : ");
            System.out.println(st);

            System.out.println("Enter the choice that you want to do : ");
            System.out.println("1.Insert at any position");
            int choice=sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter the index: ");
                    int idx=sc.nextInt();
                    if(idx>st.size()) {
                        System.out.println("Index out od bound");
                        return;
                    }
                    while(st.size()>idx){
                        temp.push(st.pop());
                    }
                    System.out.print("Enter the element that you want to insert: ");
                    int ele=sc.nextInt();
                    st.push(ele);
                    while(temp.size()!=0){
                        st.push(temp.pop());
                    }
                    System.out.println("The new stack is : ");
                    System.out.println(st);
                    break;

                default:
                    System.out.println("You enter wrong choice : ");
                    return;
            }


        }
}
