package recursion_function;
import java.util.*;
public class multiple_given_number {
    static void nthmultiple(int num,int k){
        if(k==0){
            return;
        }
        nthmultiple(num,k-1);
        System.out.println(num*k);
    }
    static int alternate_sum_nth(int num){
        if(num==0)
            return 0;
        if(num%2==0)
            return alternate_sum_nth(num-1)-num;
        else
            return alternate_sum_nth(num-1)+num;

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        System.out.print("Enter the nth multiple :");
        int k=sc.nextInt();
        nthmultiple(num,k);
        System.out.println("The sum of nth number with aternate sign is :"+alternate_sum_nth(num));
    }
}
