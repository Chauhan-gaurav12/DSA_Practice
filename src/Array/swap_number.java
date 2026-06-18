package Array;
import java.util.Scanner;
public class swap_number {
    static void swap(int [] arr,int len){
        Scanner sc=new Scanner(System.in);
        System.out.println();
        System.out.println("Enter the first position that you want to swap");
        int first=sc.nextInt();
        System.out.println("Enter second postion where to swap");
        int second=sc.nextInt();
        if(first>len || second>len){
            System.out.println("Out of range");
            return ;
        }
        for(int i=0;i<len;i++){
            for(int j=i;j<len;j++){
                if(i==first && j==second){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("After swapping the array is : ");
        for(int i=0;i<len;i++){
            System.out.print(arr[i]+"\t");
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size=sc.nextInt();
        int [] arr=new int [size] ;
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The entered array is : ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+"\t");
        }
        swap(arr,size);
    }
}
