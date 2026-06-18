package Array;
import org.w3c.dom.ls.LSOutput;

import java.util.*;
public class insertion_sort {
   static int [] inser_sort(int [] arr,int n){
        for(int i=0;i<n;i++){
          int j=i;
          while(j>0 && arr[j-1]>arr[j]){
              int temp=arr[j];
              arr[j]=arr[j-1];
              arr[j-1]=temp;
              j--;
          }
        }
        return arr;
    }


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size=sc.nextInt();

        int [] arr=new int[size];
        System.out.println("Enter th array element : ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("The array is enterd by You is : ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int [] new_arr=inser_sort(arr,size);
        System.out.println("After sorted the array is : ");
        for(int i=0;i<size;i++){
            System.out.print(new_arr[i]+" ");
        }
    }
}
