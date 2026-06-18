package recursion_function;
import java.util.*;

public class digit_sum {
    public static int digit_sum_num(int num){
        if(num>0&&num<10){
            return num;
        }
        int n=num%10;
        return n+digit_sum_num(num/10);
    }
    public static int count_digit(int num ){
        if(num>=0&&num<10){
            return 1;
        }
      return 1+count_digit(num/10);
    }
    public static int power(int p,int q){
        if(q==0){
            return 1;
        }
        return p * power(p,q-1);
    }
    static int another(int p,int q){
        if (q==0)
            return 1;
        int ano=another(p,q/2);
        if(q%2==0){
            return ano * ano;
        }
        else
            return p * ano * ano;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter the number: ");
//        int num=sc.nextInt();
//        int sum=digit_sum_num(num);
//        System.out.println("The sum of digit  is :"+sum);
//        System.out.println("Total digit is : "+count_digit(num));
        System.out.print("Enter the p: ");
        int p=sc.nextInt();
        System.out.print("Enter the value of q: ");
        int q=sc.nextInt();
        System.out.println("p^q is :"+power(p,q));
        System.out.println("p^q is :"+another(p,q));
    }
}
