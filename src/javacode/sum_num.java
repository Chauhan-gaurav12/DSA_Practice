package javacode;

import java.util.Scanner;
class sum_num{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the value of a : ");
        double a=sc.nextDouble();

        System.out.print("Enter the value of b: ");
        double b =sc.nextDouble();

        System.out.println("The sum is "+(a+b));
    }
}