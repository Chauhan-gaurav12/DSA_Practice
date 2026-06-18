package Array;
import java.util.*;
public class count_occurence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of Array:");
        int n=sc.nextInt();
        int [] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for (int i=0;i<n;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.print("\nEnter the element that you want to find in the array : ");
        int x=sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                count++;
            }
        }
        if(count>0){
            System.out.println("The element "+x+" has been occure : "+count+" times");
        }
        else{
            System.out.println("Element "+x+" Not found in the array");
        }
    }
}
