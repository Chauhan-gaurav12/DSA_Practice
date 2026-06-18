package condition;

import java.sql.SQLOutput;
import java.util.Scanner;
public class even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        System.out.println("num:"+num);
        if(num%2==0){
            System.out.println(num+ " Is a Even number");
        }
        else {
            System.out.println(num + " Is a Odd number ");
        }
    }
}
