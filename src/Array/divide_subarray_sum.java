package Array;

import java.util.Scanner;

public class divide_subarray_sum {

    static int find_array_sum(int [] arr){
        int total_sum=0;
        for(int i=0;i<arr.length;i++){
            total_sum+=arr[i];
        }
        return total_sum;
    }
    static  boolean equalsumpartion(int[] arr){
       int total_sum= find_array_sum(arr);
       int prefsum=0;
       for(int i=0;i<arr.length;i++){
           prefsum+=arr[i];
           int suffixSum=total_sum-prefsum;

           if(suffixSum==prefsum){
               return true;
           }
       }
       return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the Array element: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Entered array is : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Equal Partion possible:"+ equalsumpartion(arr));
    }
}
