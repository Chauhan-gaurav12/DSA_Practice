package Array_2D;

import java.util.Scanner;

public class reverse_row {
    static void inputarray(int [][] arr,int r,int c){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
    }
    static void printArray(int [][] arr,int r,int c){
        System.out.println("The array is : ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void reverse_row(int [][] arr,int r,int c){
        for(int i=0;i<r;i++){
            int st=0;int end=c-1;
                while(st<end){
                    int temp=arr[i][st];
                    arr[i][st]=arr[i][end];
                    arr[i][end]=temp;
                    st++;end--;
                }

        }
        printArray(arr,3,4);
    }
    public static void main(String[] args){
        int[][] arr=new int[3][4];
        System.out.println("Enter the array elements: ");
        inputarray(arr,3,4);
        System.out.println();
        System.out.println("Entered array is : ");
        printArray(arr,3,4);
        System.out.println("After reversing the array is : ");
        reverse_row(arr,3,4);
    }
}
