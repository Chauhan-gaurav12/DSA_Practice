package recursion_function;
import java.util.*;
public class check_armstrong {
    static int check_arm(int num){
        if(num==0) {
            System.out.println("Number 0 is not allowed");
            return 0;
        }
        while(num%10!=0){

        }
        return check_arm(num/10)+num*10;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        int x=check_arm(num);
    }
}
