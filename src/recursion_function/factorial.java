package recursion_function;
import java.util.*;
public class factorial {
    static int calculate_fact(int num){
        if(num==1){
            return 1;
        }
        return num* calculate_fact(num-1);
    }
    static int fibnacci_series(int num){
        if(num==0){
            return 0;
        }
        else if (num==1){
            return 1;
        }
        return fibnacci_series(num-1)+fibnacci_series(num-2);
    }
    public static void  main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=sc.nextInt();
//       int fact= calculate_fact(num);
//        System.out.println(fact);

        int fib=fibnacci_series(num);
        System.out.println(fib);
        // loop for print nth term from the 0
        int term=10;
        for (int i=0;i<=term;i++){
            System.out.println(fibnacci_series(i));
        }

        //printing the fibonacci series from the given sum
        int sum=100;
        int cur_sum=0;
        int i=0;
        while(true){
            cur_sum=fibnacci_series(i++);
            if(cur_sum>sum)
                break;
            System.out.println(cur_sum);

        }
    }
}
