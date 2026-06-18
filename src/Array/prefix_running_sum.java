package Array;
import java.util.*;
public class prefix_running_sum {
    static void prefix_sum(int [] arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            arr[i]=arr[i-1]+arr[i];
        }
        System.out.println();
        System.out.println("The array after prefix sum is :");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of the array : ");
        int n=sc.nextInt();
        int [] arr=new int[n];

        System.out.println("Enter the Array element: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Entered array is : ");
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        prefix_sum(arr);
    }
}
