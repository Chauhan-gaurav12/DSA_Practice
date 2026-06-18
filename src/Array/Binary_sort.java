package Array;
import java.util.Scanner;

public class Binary_sort {
    static void sort_array(int[] arr){
        int n=arr.length;
        int st=0;
        int end=n-1;
        while(st<end){
            if(arr[st] == 1 && arr[end] == 0){
                // swap
                int temp = arr[st];
                arr[st] = arr[end];
                arr[end] = temp;
                st++;
                end--;
            }
            if(arr[st]==0){
                st++;
            }
            if(arr[end]==1){
                end--;
            }

        }
        print_array(arr);
    }
    static void print_array(int[]arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    static void sort_even_odd(int[] arr){
        int n=arr.length;
        int st=0;int end=n-1;
        while(st<end){
            if(arr[st]%2!=0&&arr[end]%2==0){
                int temp=arr[st];
                arr[st]=arr[end];
                arr[end]=temp;
                st++;end--;
            }
            if(arr[st]%2==0){
                st++;
            }
            if(arr[end]%2!=0){
                end--;
            }
        }
        print_array(arr);
    }
    public static void main(String[] args){
        Scanner sc=new  Scanner(System.in);
        System.out.print("Enter the length of array : ");
        int n=sc.nextInt();
        int [] arr= new int[n];
        System.out.println("Enter array element; ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

       sort_even_odd(arr);

    }
}
