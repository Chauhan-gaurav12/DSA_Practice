package Array;
import java.util.Scanner;
public class rotate_array_k_steps {
    static void rotate(int [] arr,int st,int end){
       while(st<=end){
            int temp=arr[st];
            arr[st]=arr[end];
            arr[end]=temp;
            st++;
            end--;
       }
    }

    public static void main(String[] args){
        int [] arr={1,2,3,4,5,6,7,8,9};
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the steps that you want to rotate array: ");
        int k=sc.nextInt();
        int n=arr.length;
        k=k%n;
        rotate(arr,0,n-1);
        rotate(arr,0,k-1);
        rotate(arr,k,n-1);

        for(int i=0;i<n;i++){
            System.out.print (arr[i]+"\t");
        }

    }
}
