package Array;
import java.util.*;
public class last_occurence {
    static int last_occ(int [] arr,int x){
        int last_index=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                last_index=i;
            }
        }
        return last_index;
    }
    public static void main(String[] args){
        int []arr={12,5,6,7,5,4,7,5,7,8,5};
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the element that you want to find last occurence: ");
        int x=sc.nextInt();
        int last_index=last_occ(arr,x);
        if(last_index==-1){
            System.out.println("Element "+x+" is not found in the array");
        }
        else{
            System.out.println("The last occurence of element "+x+" in the array index : "+last_index);
        }
    }
}
