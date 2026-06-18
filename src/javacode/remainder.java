package javacode;

import java.sql.Statement;
import java.util.Scanner;

public class remainder {
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);

        int a ,b ,remainder;
        System.out.println("Enter divident: ");
        a=sc.nextInt();

        System.out.println("Enter divisor : ");
        b=sc.nextInt();

        int quat = a/b;
        remainder = a- b * quat ;
        System.out.println("The remainder is : " +remainder);
        // second option for this is
        int d=a%b;
        System.out.println("The remainder is : "+d);
    }
}