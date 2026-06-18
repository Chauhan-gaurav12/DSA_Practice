package recursion_function;
import java.util.Scanner;

public class natural_numbers {
    public static void increase(int num){
        if(num==0){
            return;
        }
        increase(num-1);
        System.out.println(num + " ");
    }
    public static void decrease(int num){
        if(num==0){
            return;
        }
        System.out.println(num + " ");
        decrease(num-1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        increase(num);
        decrease(num);
    }
}
