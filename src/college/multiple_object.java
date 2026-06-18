package college;
import java.util.*;

class student{
    int roll;
    String name;
}

public class multiple_object {
    static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        student[] st=new student[5];
        for(int i=0;i<5;i++){
            st[i]=new student();
            st[i].roll=sc.nextInt();
            st[i].name=sc.nextLine();
        }
        for(int i=0;i<5;i++){
            System.out.println("Student rollno- "+st[i].roll);
            System.out.println("Student name: "+st[i].name);
        }
    }
}
