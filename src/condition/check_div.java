// Wap the program that number is divisible by 5 and 3 but not by 15
package condition;

import java.util.Scanner;

public class check_div {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();

        if((num%5==0) || (num%3==0)){
            if(num%15 !=0){
                System.out.println("yes number is divisible by 5 and 3 but not 15");
            }
            else{
                System.out.println("Number is divisible by 15");
            }
        }
        else{
            System.out.println("Number is not divisible by 3 or 5");
        }
        if((num%3==0||num%5==0) && num%15 !=0){
            System.out.println("divisible by 3 or 5 but not 15");
        }
        else{
            System.out.println("divisible by 15 ");
        }
    }
}
