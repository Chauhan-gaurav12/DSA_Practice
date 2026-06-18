package Array;
//import java.util.*;

public class sum_array {
    public static void main (String[] args){
    //    Scanner sc=new Scanner(System.in);
        int sum=0;
        int [] arr={ 23,12,14};
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("The sum of the array is : "+sum);


    }
}
