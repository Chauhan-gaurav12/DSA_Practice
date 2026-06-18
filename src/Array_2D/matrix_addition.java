package Array_2D;
import java.util.*;

public class matrix_addition {

    static void inputarray(int [][] arr,int r,int c){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
    }
    static void mulArray(int[][] arr1,int r1,int c1,int[][] arr2,int r2,int c2){
        if(c1!=r2){
            System.out.println("multiplication is not posible in this ");
            return;
        }
        int [][]mul=new int[r1][c2];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                for(int k=0;k<c1;k++){
                    mul[i][j]+=arr1[i][k]*arr2[k][j];
                }
            }
        }
        printArray(mul,r1,c2);
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
    static void sumArray(int [][] arr,int[][] arr2,int r,int c){
        int [][] sum=new int[r][c];
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                sum[i][j]=arr[i][j]+arr2[i][j];
            }
        }
        System.out.println("The sum of matrix  is : ");
        printArray(sum,r,c);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the row of first  array: ");
        int r1=sc.nextInt();
        System.out.print("Enter the column of first array: ");
        int c1=sc.nextInt();
        int [][] arr=new int[r1][c1];
        System.out.println();
        System.out.println("Enter the first array element: ");
        inputarray(arr,r1,c1);


        System.out.print("Enter the row of second array :");
        int r2=sc.nextInt();
        System.out.print("Enter the column of second array: ");
        int c2=sc.nextInt();


        int [][] arr2=new int[r2][c2];
        System.out.println();

        System.out.println("Enter second array element: ");
        inputarray(arr2,r2,c2);
        System.out.println("first array is: ");
        printArray(arr,r1,c1);
        System.out.println("Second array is : ");
        printArray(arr2 ,r2,c2);

       // sumArray(arr,arr2,r1,c1,arr2,r2,c2);
        mulArray(arr,r1,c1,arr2,r2,c2);
    }
}
