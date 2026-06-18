package javamethods;
import java.util.*;


 class add_sum {
    static void sum(int a,int b){
        System.out.println("The sum of "+a + " and "+ b +" is "+(a+b));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
            int x = sc.nextInt();
            int y = sc.nextInt();

            sum(x, y);
    }
}
